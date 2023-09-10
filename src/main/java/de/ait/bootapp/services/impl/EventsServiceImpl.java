package de.ait.bootapp.services.impl;

import de.ait.bootapp.models.Event;
import de.ait.bootapp.repositories.EventsRepository;
import de.ait.bootapp.services.EventsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsServiceImpl implements EventsService {

    private final EventsRepository eventsRepository;


    public EventsServiceImpl(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    @Override
    public Event addEvent(String name, String description) {
        Event event = new Event(name, description);

        eventsRepository.save(event);

        return event;
    }

    @Override
    public List<Event> getAllEvents() {
        return eventsRepository.findAll();
    }
}
