package com.mycit;

/**
 * Created by jbyrne on 10/04/2015.
 */
public class TaxiAndHoldQueue implements TaxiAndHoldInterface{

    @Override
    public void clearFlightForTakeoff(String flightNumber) throws FlightNotFoundException, RunwayOccupiedException {

    }

    @Override
    public void flightDeparts(String flightNumber) throws FlightNotFoundException {

    }

    @Override
    public int getNumberOfFlightsOutboundTaxi() {
        return 0;
    }

    @Override
    public boolean isRunwayEmpty() {
        return false;
    }
}
