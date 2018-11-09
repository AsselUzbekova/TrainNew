package com.epam.java.train;

public class Calculator {

    LocomotivePassenger locomotivePassenger = new LocomotivePassenger(200.0, 10.5);
    Coupe coupe = new Coupe(20, 5.3);
    ReservedSeat rs = new ReservedSeat(50, 15.6);
    WagonRestaurant restaurant = new WagonRestaurant(25, 10.5);
    GeneralWagon generalWagon = new GeneralWagon(40, 20.5);

    void calculatePassengerWagon() {
        if ((locomotivePassenger.getPower() - locomotivePassenger.getWeight()) > (coupe.getWeight() + rs.getWeight() + restaurant.getWeight() + generalWagon.getWeight())) {
            System.out.println("\nThe power of this locomotive is sufficient for wagon chain's weight.");
        } else {
            System.out.println("\nThis locomotive will not be able to take the train chain.");
        }
    }

    LocomotiveFreight locomotiveFreight = new LocomotiveFreight(44.3, 10.5);
    PostWagon postWagon = new PostWagon(2.5);
    Platform platform = new Platform(7.8);
    CoalWagon coalWagon = new CoalWagon(3.6);
    Cistern cistern = new Cistern(9.0);

    void calculateFreightWagon() {
        if ((locomotiveFreight.getPower() - locomotiveFreight.getWeight()) > (postWagon.getWeight() + platform.getWeight() + coalWagon.getWeight() + cistern.getWeight())) {
            System.out.println("\nThe power of this locomotive is sufficient for wagon chain's weight.");
        } else {
            System.out.println("\nThis locomotive will not be able to take the train chain.");
        }
    }
}
