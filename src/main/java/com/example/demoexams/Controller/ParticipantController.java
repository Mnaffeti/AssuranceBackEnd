package com.example.demoexams.Controller;

import com.example.demoexams.Entity.Participant;
import com.example.demoexams.Service.IParticipService;
import com.example.demoexams.Service.ParticipServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class ParticipantController {
    IParticipService participService;
    @PostMapping(path = "/participant")
    public Participant addParticipant(@RequestBody Participant participant) {
        return participService.ajouterParticipant(participant);
    }


}
