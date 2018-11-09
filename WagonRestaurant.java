package com.epam.java.train;

import java.util.ArrayList;

public class WagonRestaurant extends PassengerWagon {

    private int numberOfSeats;

    WagonRestaurant() {
    }

    WagonRestaurant(int numberOfSeats, double weight) {
        this.numberOfSeats = numberOfSeats;
        super.setWeight(weight);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    static void outWagonRestaurant() {
        ArrayList<String> wagon = new ArrayList<>();
        wagon.add("WagonRestaurant");
        System.out.print(wagon);
    }
}
