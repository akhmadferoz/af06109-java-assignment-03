package com.company;

import javax.sound.sampled.FloatControl;

public class Seat implements Comparable<Seat> {
    private String number, location;

    Seat() {
        this.number = "";
        this.location = "";
    }

    Seat(String n) {
        this.number = n;

        switch (n.substring(n.length() - 1)) {
            case "A", "G" -> this.location = "Window";
            case "B", "C", "E", "F" -> this.location = "Isle";
            case "D" -> this.location = "Middle";
            default -> this.location = "ERROR: Seat not found. Unable to determine location.";
        }
    }

    @Override
    public String toString() {
        return  "Seat: " + number + ", Location: " + location;
    }

    @Override
    public int compareTo(Seat s1) {
        return this.number.compareTo(s1.number);
    }
}
