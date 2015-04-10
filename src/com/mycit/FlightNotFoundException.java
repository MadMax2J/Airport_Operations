package com.mycit;

/**Runtime Exception to deal with Flights not found.
 * Created by jbyrne on 10/04/2015.
 */
public class FlightNotFoundException extends java.lang.RuntimeException {

    public FlightNotFoundException(){
        super("No flight was found!");

    }

}
