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


    public void addPassenger(Passenger newPassenger){
        passengerManifest.add(newPassenger);
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


    public String toString(){
        int numberOfTabs = 30 / this.getAirline().length();
        return this.getFlightNumber() + "\t\t\t" + this.getAirline() + new String(new char[numberOfTabs]).replace("\0", "\t") + this.getDestination() + "\t\t\t\t" + String.valueOf(this.passengerManifest.size()) + "\n";
        //// Y@es, this is the most convoluted toString method I ever wrote!
    }

}
