package com.epam.java.train;

import java.util.ArrayList;

public class Cistern extends FreightWagon {

    Cistern() {
    }

    Cistern(double weight) {
        super.setWeight(weight);
    }

    static void outPlatform() {
        ArrayList<String> wagon = new ArrayList<>();
        wagon.add("Cistern");
        System.out.println(wagon);
    }
}
