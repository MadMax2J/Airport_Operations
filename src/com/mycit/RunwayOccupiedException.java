package com.mycit;

/**A Runtime Exception to deal with an occupied runway.
 * Created by jbyrne on 10/04/2015.
 */
public class RunwayOccupiedException extends java.lang.RuntimeException {

    public RunwayOccupiedException(){
        super("The Runway is occupied and can't take another flight. Flight on runway must first depart.");
    }

}
