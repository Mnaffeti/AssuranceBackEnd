package com.example.demoexams.Controller;

import com.example.demoexams.Entity.Event;
import com.example.demoexams.Entity.Participant;
import com.example.demoexams.Service.IEventService;
import com.example.demoexams.Service.IParticipService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class EventController {
    IEventService eventService;
    @PostMapping(path = "/event")
    public Event ajoutEvent(@RequestBody Event e) {
        return eventService.ajoutAffectEventParticip(e);
    }
    @GetMapping(path="event")
    public List<Event> getEvents() {
        return eventService.DisplayAllEvents();
    }
}
