package com.example.demoexams.Controller;

import com.example.demoexams.Entity.Participant;
import com.example.demoexams.Service.IParticipService;
import com.example.demoexams.Service.ParticipServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class ParticipantController {
    IParticipService participService;
    @PostMapping(path = "/participant")
    public Participant addParticipant(@RequestBody Participant participant) {
        return participService.ajouterParticipant(participant);
    }
    @GetMapping(path = "/participant")
    public List<Participant> getAllParticipant() {
        return participService.findAllParticipants();
    }
    @GetMapping(path = "/participant_hasnevents")
    public List<Participant> getParticipantHasnevents() {
        return participService.findAllParticipantsThatHasEventAndHasNotReservedLogs();
    }


}
