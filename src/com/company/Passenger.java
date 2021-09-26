package com.company;

public class Passenger {
    private String name, PNR;

    Passenger() {
        this.name = "Passenger not found";
        this.PNR = "PNR not found";
    }

    Passenger(String n, String bookingNumber) {
        this.name = n;
        this.PNR = bookingNumber;
    }

    @Override
    public String toString() {
        return "PNR: " + PNR + ", Name: " + name;
    }
}
