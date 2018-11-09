package com.epam.java.train;

abstract class FreightWagon {

    private double weight;

    FreightWagon() {
    }

    FreightWagon(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
