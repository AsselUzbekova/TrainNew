package com.epam.java.train;

import java.util.ArrayList;

public class GeneralWagon extends PassengerWagon {

    private int numberOfSeats;

    GeneralWagon() {
    }

    GeneralWagon(int numberOfSeats, double weight) {
        this.numberOfSeats = numberOfSeats;
        super.setWeight(weight);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    static void outGeneralWagon() {
        ArrayList<String> wagon = new ArrayList<>();
        wagon.add("GeneralWagon");
        System.out.println(wagon);
    }
}
