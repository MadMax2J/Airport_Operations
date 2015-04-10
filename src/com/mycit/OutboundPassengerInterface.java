package com.mycit;

/**Outbound Passenger Interface Specification
 * Created by jbyrne on 10/04/2015.
 */
public interface OutboundPassengerInterface {

    public boolean isEmpty();

    public void generatePassengers();

    public Passenger pop()throws StackEmptyException;

    public void popAll();

    public void peek();

   // public void push();





}
