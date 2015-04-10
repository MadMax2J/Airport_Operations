package com.mycit;

import java.util.ArrayList;

/**A Simple Linked List containing Flights at their Gates
 * Created by jbyrne on 10/04/2015.
 */
public class ScheduledFlights implements ScheduledFlightsInterface {

    private FlightNode head;

    public ScheduledFlights(){
        this.head = null;
    }

    @Override
    public void addFlight(Flight flight) {
        if(!isFlightsEmpty()){
            this.head = new FlightNode(flight, head);
        }else{
            this.head = new FlightNode(flight);
        }


    }

    @Override
    public void cancelFlight(String flightNumber) throws FlightNotFoundException {

    }

    @Override
    public boolean flightIsFull(String flightNumber) throws FlightNotFoundException {
        return false;
    }

    @Override
    public void clearFlightForPushBackTaxiAndHold(String flightNumber) throws FlightNotFoundException {

    }

    @Override
    public Flight findFlight(String flightNumber) throws FlightNotFoundException {
        Flight result = null;
        FlightNode target = head;
        do{
            if (target.getFlight().getFlightNumber()==flightNumber){
                result = target.getFlight();
            }else{
                target = target.getNextNode();
            }


        }while(result == null); //Need to allow for Not in list!!



        return result;
    }

    @Override
    public ArrayList<Flight> findAllFlights(String sortBy) {
        return null;
    }

    @Override
    public boolean isFlightsEmpty() {
        return head == null;
    }

    @Override
    public int getNumberOfFlightsAtGate() {
        return 0;
    }
}
