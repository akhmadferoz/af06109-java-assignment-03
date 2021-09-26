package com.company;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main{

    public static void main(String[] args) {
	// write your code here
        TreeMap<Seat, Passenger> passengerList = new TreeMap<>();

        passengerList.put( new Seat("17D"), new Passenger("Asad", "AQ98DF") );
        passengerList.put( new Seat("02B"), new Passenger("Faisal", "JMUILP") );
        passengerList.put( new Seat("15B"), new Passenger("Farooq", "78KLPX") );
        passengerList.put( new Seat("32A"), new Passenger("Ahsan", "OLSIVF") );
        passengerList.put(new Seat("18F"), new Passenger("Faiza", "UJ89IK") );
        passengerList.put( new Seat("20C"), new Passenger("Amna", "UXDFW0") );

        for (Map.Entry<Seat, Passenger> entry : passengerList.entrySet()) {
            System.out.println( entry.getValue() + ", " + entry.getKey() );
        }
    }
}
