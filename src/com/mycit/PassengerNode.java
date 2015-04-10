package com.mycit;

/**
 * Created by jbyrne on 10/04/2015.
 */
public class PassengerNode {

    private Passenger passenger;
    private PassengerNode nextNode;

    public PassengerNode(Passenger passenger){
        this.passenger = passenger;
        this.nextNode = null;
    }


    public PassengerNode(Passenger passenger, PassengerNode nextNode){
        this.passenger = passenger;
        this.nextNode = nextNode;
    }


    ////Getters and Setters


    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public PassengerNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(PassengerNode nextNode) {
        this.nextNode = nextNode;
    }
}
