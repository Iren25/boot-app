package de.ait.bootapp.controllers;

import de.ait.bootapp.services.EventsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EventsController {

    private final EventsService eventsService;

    private List<String> words = new ArrayList<>();
    private List<String> events = new ArrayList<>();

    public EventsController(EventsService eventsService, List<String> words, List<String> events) {
        this.eventsService = eventsService;
        this.words = words;
        this.events = events;
    }

    @PostMapping("/words")
    public String addWord(@RequestParam("word") String word) {
        words.add(word);
        return "redirect:/success_add_word.html";
    }

    @GetMapping("/words")
    public String getWordsPage(Model model) {
        model.addAttribute("wordsList", words);
        return "words_page";
    }

    @PostMapping("/events")
    public String addEvent(@RequestParam("name") String eventName,
                           @RequestParam("description") String description) {
        events.add(eventName + ": " + description);
        return "redirect:/success_add_event.html";
    }

    @GetMapping("/events")
    public String getEventsPage(Model model) {
        model.addAttribute("eventsList", events);
        return "events_page";
    }
}
