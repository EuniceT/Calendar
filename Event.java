package com.example.matthew.calendarapp;

public class Event {

    private String title;
    private Date date;
    private String description;
    private String time;

    public Event(String title, Date date, String description, String time)
    {
        this.title = title;
        this.date = date;
        this.description = description;
        this.time = time;
    }

    public String getTitle()
    {
        return title;
    }

    public String getTime() { return time; }

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
        return title + ": " + time +": " + description ;
    }


}


