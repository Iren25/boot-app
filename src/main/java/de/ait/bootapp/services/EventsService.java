package de.ait.bootapp.services;

import de.ait.bootapp.models.Event;

import java.util.List;

public interface EventsService {
    Event addEvent(String name, String description);

    List<Event> getAllEvents();
}
