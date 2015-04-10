package com.mycit;

import java.util.ArrayList;

/**Flight object definition
 * Created by jbyrne on 10/04/2015.
 */
public class Flight {

    private String flightNumber;
    private String airline;
    private int passengerCapacity;
    private String destination;
    private ArrayList<Passenger> passengerManifest;
    private boolean priority = false;       //Is this a Priority Flight


    public Flight(String flightNumber, String airline, int passengerCapacity, String destination){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.passengerCapacity = passengerCapacity;
        this.destination = destination;
        passengerManifest = new ArrayList<Passenger>();

    }



    ////Getters and Setters

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public ArrayList<Passenger> getPassengerManifest() {
        return passengerManifest;
    }

    public void setPassengerManifest(ArrayList<Passenger> passengerManifest) {
        this.passengerManifest = passengerManifest;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

}
