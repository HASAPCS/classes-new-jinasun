package com.example;

public class Clock {
    private int hours;
    private int minutes;

    public Clock(int hours, int minutes) {
        this.hours =  hours;
        this.minutes = minutes;
        // TODO: Initialize the hours and minutes
    }

    public void addMinutes(int minutesToAdd) {
        this.minutes += minutesToAdd;
        if (this.minutes>=60){
            this.hours += 1;
            this.minutes -= 60;
        }

    }

    public String getTime() {
        if (this.hours >= 13){
            this.hours -= 12;
            return "0" + this.hours + ":" + this.minutes;
        }
        return this.hours + ":" + this.minutes;
    }
}
