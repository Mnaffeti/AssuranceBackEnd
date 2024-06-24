package com.example.demoexams.Service;

import com.example.demoexams.Entity.Participant;

import java.util.List;

public interface IParticipService {
    public Participant ajouterParticipant (Participant p);
    List<Participant> findAllParticipants();
    List<Participant> findAllParticipantsThatHasEventAndHasNotReservedLogs();
}
