package com.d42gmail.cavar.linearinflator;

/**
 * Created by Enigma on 23.1.2016..
 */
public class person {

    private String name;
    private String description;
    private String date;

    public person(String name, String description, String date) {
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
