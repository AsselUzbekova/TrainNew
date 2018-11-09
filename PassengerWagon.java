package com.epam.java.train;

abstract class PassengerWagon {

    private double weight;

    PassengerWagon() {
    }

    PassengerWagon(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
