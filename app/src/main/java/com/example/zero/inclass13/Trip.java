package com.example.zero.inclass13;

/**
 * Created by Zero on 12/4/2017.
 */

public class Trip {

    private double cost;
    private String duration;
    private int lat;
    private int lon;
    private String place;

    public Trip() {
    }

    public Trip(double cost, String duration, int lat, int lon, String place) {
        this.cost = cost;
        this.duration = duration;
        this.lat = lat;
        this.lon = lon;
        this.place = place;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "cost=" + cost +
                ", duration='" + duration + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", place='" + place + '\'' +
                '}';
    }
}
