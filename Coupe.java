package com.epam.java.train;

import java.util.ArrayList;
import java.util.HashMap;

public class Coupe extends PassengerWagon {

    private int numberOfSeats;

    Coupe() {
    }

    Coupe(int numberOfSeats, double weight) {
        this.numberOfSeats = numberOfSeats;
        super.setWeight(weight);
//        super.setWeight(5.3);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    static void generatePassengerWagonCoupe() {
        HashMap<Object, String> coupeWagon = new HashMap<>();
        Coupe coupeFirst = new Coupe();
        Coupe coupeSecond = new Coupe();
        Coupe coupeThird = new Coupe();
        coupeWagon.put(coupeFirst, "Coupe 1001");
        coupeWagon.put(coupeSecond, "Coupe 1002");
        coupeWagon.put(coupeThird, "Coupe 1003");
        ArrayList<String> wagonCoupe = new ArrayList<>();
        wagonCoupe.add(coupeWagon.get(coupeFirst));
        wagonCoupe.add(coupeWagon.get(coupeSecond));
        wagonCoupe.add(coupeWagon.get(coupeThird));
        System.out.print(wagonCoupe);
    }
}
