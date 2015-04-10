package com.mycit;

/**A node for use in data structures that deal with Objects of type Flight
 * Created by jbyrne on 10/04/2015.
 */
public class FlightNode {

    private Flight flight;
    private FlightNode nextNode;

    public FlightNode(Flight flight){   //First Node
        this.flight = flight;
        this.nextNode = null;

    }

    public FlightNode(Flight flight, FlightNode nextNode){   //Other Nodes
        this.flight = flight;
        this.nextNode = nextNode;

    }

    ////Getters and Setters

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public FlightNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(FlightNode nextNode) {
        this.nextNode = nextNode;
    }
}
