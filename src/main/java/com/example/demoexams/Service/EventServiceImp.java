package com.example.demoexams.Service;

import com.example.demoexams.Entity.Event;
import com.example.demoexams.Entity.Logistique;
import com.example.demoexams.Entity.Participant;
import com.example.demoexams.Repo.EventRepo;
import com.example.demoexams.Repo.ParticipRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class EventServiceImp implements IEventService {
    EventRepo eventRepo;
    ParticipRepo participRepo;
    @Override
    public Event ajoutAffectEventParticip(Event e) {
        // Save the event first to get its ID
        Event addedEvent = eventRepo.save(e);
        List<Participant> participList = e.getParticipantList();

        if (participList != null) {
            List<Participant> updatedParticipants = new ArrayList<>();
            for (Participant p : participList) {
                Participant pe = participRepo.findById(p.getId()).orElse(null);
                if (pe != null) {
                    if (pe.getEvents() == null) {
                        pe.setEvents(new ArrayList<>());
                    }
                    pe.getEvents().add(addedEvent);
                    //updatedParticipants.add(pe); // Add the participant to the list of updated participants
                }
            }
            // Save all updated participants after the loop
            participRepo.saveAll(updatedParticipants);

            // Ensure the event is aware of the participants
            if (addedEvent.getParticipantList() == null) {
                addedEvent.setParticipantList(new ArrayList<>());
            }
            // Avoid adding duplicate participants
            for (Participant p : updatedParticipants) {
                if (!addedEvent.getParticipantList().contains(p)) {
                    addedEvent.getParticipantList().add(p);
                }
            }
            eventRepo.save(addedEvent); // Save the event with the updated participant list
        }

        return addedEvent;
    }





    @Override
    public List<Event> DisplayAllEvents() {
        return eventRepo.findAll();
    }
    @Transactional
    @Scheduled(fixedRate = 60000)
    public void CalculCout() {
        List<Event> eventList = eventRepo.findAll();
        for (Event e : eventList) {
            float cout = 0;
            if (e.getLogs() != null) {
                for (Logistique l : e.getLogs()) {
                    cout += l.getPrixUnit();
                }
            }
            e.setCout(e.getCout());
        }
        eventRepo.saveAll(eventList);
    }
}
