package com.mycit;

import java.util.ArrayList;

/**Scheduled Flights Interface Specification
 * Created by jbyrne on 10/04/2015.
 */
public interface ScheduledFlightsInterface {

    // 1. Add a Flight Object to the Data Structure.
    public void addFlight(Flight flight);


    // 2. Remove a specific flight from the Data Structure.
    public void cancelFlight(String flightNumber) throws FlightNotFoundException;


    // 3. Check if a Flight is full.
    public boolean flightIsFull(String flightNumber) throws FlightNotFoundException;


    // 4. Clear a flight for Push-back from the Gate, Taxi and Hold short of Runway.
    // Has the effect of moving the flight Object from the scheduledFlights to
    // the flightTaxiAndHoldQueue data structure. Might Position based on Priority.
    public void clearFlightForPushBackTaxiAndHold(String flightNumber) throws FlightNotFoundException;


    // 7. Returns a Flight given the Flight Number
    public Flight findFlight(String flightNumber) throws FlightNotFoundException;


    // 8. Returns an Array of Flights at the Airport, Sorted by a given parameter
    public ArrayList<Flight> findAllFlights(String sortBy);


    // 9. Generates additional passengers with Random details.
    //public ArrayList<Passenger> recieveAdditionalPassengers();


    //// Fairly generic functions

    // Determines whether the list of Scheduled Flights is empty.
    public boolean isFlightsEmpty();

    // Determines the number of Scheduled Flights at Gate.
    public int getNumberOfFlightsAtGate();




    // Determines whether the list of Passengers in the Terminal is empty.
    //public boolean isTerminalEmpty();

   // public int getNumberOfPassengers();



}
