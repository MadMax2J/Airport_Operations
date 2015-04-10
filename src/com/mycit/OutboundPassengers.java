package com.mycit;

/**A Stack with Passenger Objects
 * Created by jbyrne on 10/04/2015.
 */
public class OutboundPassengers implements OutboundPassengerInterface {


    private PassengerNode top;

    public OutboundPassengers(){
        top = null;
    } // end default constructor

    @Override
    public boolean isEmpty() {
        return top == null;
    } // end isEmpty

    @Override
    public void generatePassengers() {
        this.top = new PassengerNode(new Passenger("John", "PP#12323454"), top);
        this.top = new PassengerNode(new Passenger("Paul", "PP#42343454"), top);
        this.top = new PassengerNode(new Passenger("George", "PP#23122154"), top);
        this.top = new PassengerNode(new Passenger("Ringo", "PP#98762154"), top);

    }

    @Override
    public Passenger pop() throws StackEmptyException {
        if (!isEmpty()) {
            PassengerNode temp = top;
            top = top.getNextNode();
            return temp.getPassenger();
        }
        else {
            throw new StackEmptyException();
        } // end if
    } // end pop


    @Override
    public void popAll() {

    }

    @Override
    public void peek() {

    }
}
