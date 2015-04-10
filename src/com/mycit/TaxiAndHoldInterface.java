package com.mycit;

/**Taxi and Hold Interface Specification
 * Created by jbyrne on 10/04/2015.
 */
public interface TaxiAndHoldInterface {

    // 5. Clear a flight for Take-off.
    // Has the effect of moving the flight Object from
    // the flightTaxiAndHoldQueue to the flightClearedForTakeOff data structure, which
    // represents the runway and has a size of [1].
    public void clearFlightForTakeoff(String flightNumber) throws FlightNotFoundException, RunwayOccupiedException;


    // 6. Process a flight departure.
    // Pops the Flight object from the Runway flightClearedForTakeOff data structure
    public void flightDeparts(String flightNumber) throws FlightNotFoundException;

    // Determines the number of Flights Outbound Taxi to Runway.
    public int getNumberOfFlightsOutboundTaxi();

    // Determines if the Runway is available
    public boolean isRunwayEmpty();
}
