package com.example.demoexams.Service;

import com.example.demoexams.Entity.Event;

import java.util.List;

public interface IEventService {
    public
    Event ajoutAffectEventParticip (Event e);
    List<Event> DisplayAllEvents();

}
