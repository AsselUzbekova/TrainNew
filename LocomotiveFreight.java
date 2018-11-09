package com.epam.java.train;

import java.util.ArrayList;

class LocomotiveFreight extends FreightWagon {

    private double power;

    LocomotiveFreight() {
    }

    LocomotiveFreight(double power, double weight) {
        this.power = power;
        super.setWeight(weight);
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    static void outLoco() {
        ArrayList<String> wagon = new ArrayList<>();
        wagon.add("Locomotive");
        System.out.print(wagon);
    }
}
