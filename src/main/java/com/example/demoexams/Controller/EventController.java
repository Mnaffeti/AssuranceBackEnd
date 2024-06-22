package com.example.demoexams.Controller;

import com.example.demoexams.Entity.Event;
import com.example.demoexams.Entity.Participant;
import com.example.demoexams.Service.IEventService;
import com.example.demoexams.Service.IParticipService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class EventController {
    IEventService eventService;
    @PostMapping(path = "/event")
    public Event ajoutEvent(@RequestBody Event e) {
        return eventService.ajoutAffectEvenParticip(e);
    }
}
