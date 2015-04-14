package com.mycit;

/**Passenger object definition
 * Created by jbyrne on 10/04/2015.
 */
public class Passenger {

    private String passengerName;
    private String destinationCode;
    private String destinationCity;

    public Passenger(String passengerName, String destinationCode, String destinationCity){
        this.passengerName = passengerName;
        this.destinationCode = destinationCode;
        this.destinationCity = destinationCity;
    }


    ////Getters and Setters

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String toString(){
        return "Passenger Name: " + getPassengerName() + ",\tPassenger Destination: " + getDestinationCode() + "\t" + getDestinationCity();
    }
}
