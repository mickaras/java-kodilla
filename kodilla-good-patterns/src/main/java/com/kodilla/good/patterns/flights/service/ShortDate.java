package com.kodilla.good.patterns.flights.service;

public class ShortDate {
    Day day;
    int hour;
    int minutes;

    public ShortDate(Day day, int hour, int minutes) {
        this.day = day;
        this.hour = hour;
        this.minutes = minutes;
    }
    private int flatDate(ShortDate date){
        return date.day.ordinal()*24*60+date.hour*60+date.minutes;
    }
    public int transferTime(ShortDate dateTested){
        ShortDate currentDate = new ShortDate(day, hour, minutes);
        if(flatDate(dateTested)-flatDate(currentDate)<0){
            return flatDate(dateTested)-flatDate(currentDate)+7*24*60;
        }
        return flatDate(dateTested)-flatDate(currentDate);
    }
    public String readableTransferTime(ShortDate dateTested){
        if(transferTime(dateTested)<60){
            return transferTime(dateTested)+" minute(s)";
        }
        if(transferTime(dateTested)>=60 && transferTime(dateTested)<60*24){
            return transferTime(dateTested)/60+" hour(s) "+ transferTime(dateTested)%60+" minute(s)";
        }
        else return transferTime(dateTested)/(60*24)+" day(s) "+ transferTime(dateTested)%(60*24)/60+" hour(s) "+transferTime(dateTested)%(60*24)%60+" minute(s)" ;
    }

    @Override
    public String toString() {
        return day+": "+hour+":"+minutes;
    }
}
