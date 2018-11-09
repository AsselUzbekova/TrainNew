package com.epam.java.train;

import java.util.ArrayList;
import java.util.HashMap;

public class ReservedSeat extends PassengerWagon {

    private int numberOfSeats;

    ReservedSeat() {
    }

    ReservedSeat(int numberOfSeats, double weight) {
        this.numberOfSeats = 50;
        super.setWeight(weight);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    static void generatePassengerWagonReservedSeat() {
        HashMap<Object, String> reservedSeatWagon = new HashMap<>();
        ReservedSeat reservedSeatFirst = new ReservedSeat();
        ReservedSeat reservedSeatSecond = new ReservedSeat();
        ReservedSeat reservedSeatThird = new ReservedSeat();
        reservedSeatWagon.put(reservedSeatFirst, "ReservedSeat 2004");
        reservedSeatWagon.put(reservedSeatSecond, "ReservedSeat 2005");
        reservedSeatWagon.put(reservedSeatThird, "ReservedSeat 2006");
        ArrayList<String> wagonReservedSeat = new ArrayList<>();
        wagonReservedSeat.add(reservedSeatWagon.get(reservedSeatFirst));
        wagonReservedSeat.add(reservedSeatWagon.get(reservedSeatSecond));
        wagonReservedSeat.add(reservedSeatWagon.get(reservedSeatThird));
        System.out.print(wagonReservedSeat);
    }
}
