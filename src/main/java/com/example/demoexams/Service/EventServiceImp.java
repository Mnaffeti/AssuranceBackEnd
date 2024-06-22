package com.example.demoexams.Service;

import com.example.demoexams.Entity.Event;
import com.example.demoexams.Entity.Participant;
import com.example.demoexams.Repo.EventRepo;
import com.example.demoexams.Repo.ParticipRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventServiceImp implements IEventService {
    EventRepo eventRepo;
    ParticipRepo participRepo;
    @Override
    public Event ajoutAffectEvenParticip(Event e) {

       return eventRepo.save(e);

    }
}
