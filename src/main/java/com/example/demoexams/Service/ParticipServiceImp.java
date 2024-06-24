package com.example.demoexams.Service;

import com.example.demoexams.Entity.Participant;
import com.example.demoexams.Entity.Tache;
import com.example.demoexams.Repo.ParticipRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ParticipServiceImp implements IParticipService{
    ParticipRepo participRepo;
    @Override
    public Participant ajouterParticipant(Participant p) {
        return participRepo.save(p);
    }

    @Override
    public List<Participant> findAllParticipants() {
        return participRepo.findAll();
    }
    public List<Participant> findAllParticipantsThatHasEventAndHasNotReservedLogs() {
        return participRepo.findAll().stream()
                .filter(participant -> participant.getTache() == Tache.ORGRANISATEUR).

                filter(participant -> participant.getEvents() != null && !participant.getEvents().isEmpty())

                .filter(participant -> participant.getEvents().stream().allMatch(event -> event.getLogs() == null || event.getLogs().isEmpty()))

                .collect(Collectors.toList());

    }


}
