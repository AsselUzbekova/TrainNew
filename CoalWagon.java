package com.epam.java.train;

import java.util.ArrayList;

public class CoalWagon extends FreightWagon {

    CoalWagon() {
    }

    CoalWagon(double weight) {
        super.setWeight(weight);
    }

    static void outPlatform() {
        ArrayList<String> wagon = new ArrayList<>();
        wagon.add("CoalWagon");
        System.out.print(wagon);
    }
}
