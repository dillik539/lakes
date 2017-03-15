package com.dilli;

import java.util.*;

/*
This defines a class and methods that can be
used by any other related program
 */
public class lakes {
    //initializes private variables
    private String name;
    private ArrayList<Double> time;
    //defines getters and setters
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public ArrayList<Double> getTime(){
        return time;
    }
    public void setTime(ArrayList<Double> time){
        this.time = time;
    }

    //this defines Constructor
    lakes(String lakesName) {
        this.name = lakesName;
        this.time = new ArrayList<Double>();
    }
    //this defines a method to add time
    public void addTime(double timeTaken){
        time.add(timeTaken);
    }
    //this defines a method that calculates minimum time to run around a lake
    public double minTime(){
        double minTimeTaken = Collections.min(time);
        return minTimeTaken;
    }
    //this defines a method that prints the running info.
    public void writeRunningInfo(){
        System.out.println(name + ", " + minTime());
        System.out.println();
    }
}