package com.mycit;

/**Passenger object definition
 * Created by jbyrne on 10/04/2015.
 */
public class Passenger {

    private String passengerName;
    private String otherDetails;

    public Passenger(String passengerName, String otherDetails){
        this.passengerName = passengerName;
        this.otherDetails = otherDetails;

    }


    ////Getters and Setters

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    public String toString(){
        return "Passenger Name: " + this.passengerName + ", Passenger Details: " + this.otherDetails + "!";
    }
}
