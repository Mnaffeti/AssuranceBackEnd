package com.example.demoexams.Service;

import com.example.demoexams.Entity.Participant;
import com.example.demoexams.Repo.ParticipRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ParticipServiceImp implements IParticipService{
    ParticipRepo participRepo;
    @Override
    public Participant ajouterParticipant(Participant p) {
        return participRepo.save(p);
    }
}
