package com.mycit;

import java.util.Random;

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
        String[] names = ("John Paul George Ringo Claudie Joannie Gerardo Inell Lyndsey Irmgard Jacinta Johnsie" +
                " Cedrick Treasa Alexis Noble Alejandra Laveta Del Rachel Gabrielle Bettina Retta Tennie Floretta" +
                " Alyson Lauryn Tifany Michelle Migdalia Candis Brittni Delbert Elana Ilse Mercy Fanny Katerine" +
                " Flossie Takako Babette Tonya Barton Sirena Suellen Elia Cathleen Hailey Louise Steffanie Lorenzo" +
                " Carmella Terry Nadia").split(" ");

        String[] destinationCode = ("ATL PEK ORD LHR HND LAX CDG DFW FRA DEN HKG MAD DXB JFK AMS CGK BKK SIN CAN PVG" +
                " IAH LAS SFO PHX CLT FCO SYD MIA MCO MUC").split(" ");

        String[] destinationCity = ("Atlanta,GA Beijing Chicago,IL London Tokyo Los_Angeles,CA Paris Dallas,TX" +
                " Frankfurt Denver,CO Hong_Kong Madrid Dubai New_York,NY Amsterdam Jakarta Bangkok Singapore" +
                " Guangzhou Shanghai Houston,TX Las_Vegas,NV San_Francisco,CA Phoenix,AZ Charlotte,NC Rome Sydney" +
                " Miami,FL Orlando,FL Munich").split(" ");

        System.out.println("Names has " + names.length + " elements.\n" +
                "Destination Codes have " + destinationCode.length + " elements.\n" +
                "Destination City has " + destinationCity.length + " elements.");

        Random random = new Random();

        for(int x = 1; x < 200; x++) {

            String randomName = names[random.nextInt(names.length - 1)];

            int randDestination = random.nextInt(destinationCity.length - 1);
            String randomDestCode = destinationCode[randDestination];
            String randonDestName = destinationCity[randDestination];

            this.top = new PassengerNode(new Passenger(randomName, randomDestCode, randonDestName), top);
        }


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
