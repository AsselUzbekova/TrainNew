package com.epam.java.train;

import java.util.ArrayList;

public class Platform extends FreightWagon {

    Platform() {
    }

    Platform(double weight) {
        super.setWeight(weight);
    }

    static void outPlatform() {
        ArrayList<String> wagon = new ArrayList<>();
        wagon.add("Platform");
        System.out.print(wagon);
    }
}
