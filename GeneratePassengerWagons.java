package com.epam.java.train;

public class GeneratePassengerWagons {

    static void generate() {
        LocomotivePassenger.outLoco();
        Coupe.generatePassengerWagonCoupe();
        ReservedSeat.generatePassengerWagonReservedSeat();
        WagonRestaurant.outWagonRestaurant();
        GeneralWagon.outGeneralWagon();
    }
}
