package com.mycit;

public class Main {

    public static void main(String[] args) {

        /*  Before I go creating the Menu, What do I want to manually do to test all is working...
        *   1. Generate some Flights
        *   2. Generate some Passengers
        *   3. Populate some Flights?
        *   4. Make a Flight go to Taxi
        *   5. Add another Flight to Taxi
        *   6. Clear Flight for Departure
        *   7. Clear another flight for Departure. - This should fail as Runway occupied.
        *   8. Depart Flight
        *   9. Clear Flight for Departure again. - - Should succeed this time.
        *   10. Depart flight
        *   11. Add more flights / Passengers
        *   12. Delete Flights / Cancel bookings.
        *   13. Graceful exit
        */

        ScheduledFlights scheduledFlights = new ScheduledFlights();
        OutboundPassengers outboundPassengers = new OutboundPassengers();   //This can be a Stack
        TaxiAndHoldQueue taxiAndHoldQueue = new TaxiAndHoldQueue();
        Flight[] flightClearedForTakeoff = new Flight[1];                   //Contains a Flight on the Runway


        // 1.
        scheduledFlights.addFlight(new Flight("EI123", "Aer Lingus", 20, "CDG"));
        scheduledFlights.addFlight(new Flight("EI223", "Aer Lingus", 20, "STN"));
        scheduledFlights.addFlight(new Flight("EI323", "Aer Lingus", 20, "LHR"));


        // 2.

        outboundPassengers.generatePassengers();


        // 3.
        scheduledFlights.findFlight("EI123").addPassenger(outboundPassengers.pop());
        scheduledFlights.findFlight("EI223").addPassenger(outboundPassengers.pop());

        // 4 & 5
        scheduledFlights.clearFlightForPushBackTaxiAndHold("EI123");
        scheduledFlights.clearFlightForPushBackTaxiAndHold("EI223");

        // 6.
        taxiAndHoldQueue.clearFlightForTakeoff("EI123");

        // 7.
        taxiAndHoldQueue.clearFlightForTakeoff("EI223");  //Should Fail as Runway Occupied.

        // 8.
        //flightDeparts(flightClearedForTakeoff[0]); //Instructs the Flight on the Runway to depart.
                //Could do this as an Array based Stack or similar??

        // 9.
        taxiAndHoldQueue.clearFlightForTakeoff("EI223");  //Should Work this time as Runway cleared.

        // 10.
        //flightDeparts(flightClearedForTakeoff[0]); //Instructs the Flight on the Runway to depart.
                //Could do this as an Array based Stack or similar??

        // 11.
        scheduledFlights.addFlight(new Flight("RA456", "Ryanair", 20, "LGW"));
        scheduledFlights.addFlight(new Flight("BA747", "British Airways", 20, "AMS"));
        outboundPassengers.generatePassengers();

        // 12.
        scheduledFlights.cancelFlight("EI323");
        outboundPassengers.pop();

        // 13.
        //END??

    }

}
