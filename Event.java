package com.example.matthew.calendarapp;

public class Event {

    private String title;
    private Date date;
    private String description;


    public Event(String title, Date date, String description)
    {
        this.title = title;
        this.date = date;
        this.description = description;
    }

    public String getTitle()
    {
        return title;
    }

    public Date getDate()
    {
        return date;
    }

    public String getDescription()
    {
        return description;
    }

    public String toString()
    {
        return title + ": " + description;
    }


}


