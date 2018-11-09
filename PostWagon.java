package com.epam.java.train;

import java.util.ArrayList;

public class PostWagon extends FreightWagon {

    PostWagon() {
    }

    PostWagon(double weight) {
        super.setWeight(weight);
    }

    static void outPostWagon() {
        ArrayList<String> wagon = new ArrayList<>();
        wagon.add("PostWagon");
        System.out.print(wagon);
    }
}
