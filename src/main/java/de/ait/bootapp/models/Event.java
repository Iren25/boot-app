package de.ait.bootapp.models;

import lombok.Getter;

@Getter
public class Event {
    private String name;
    private String description;


    public Event(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
