package com.epam.java.train;

import java.util.Scanner;

public class Logic {

    Calculator calc = new Calculator();

    void chose() {
        System.out.println("Chose the wagon's type: 1 - passengers' 2 - freight");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        switch (n) {
            case 1:
                System.out.println("\nThe chain of passengers' wagons:\n");
                GeneratePassengerWagons.generate();
                calc.calculatePassengerWagon();
                break;

            case 2:
                System.out.println("\nThe chain of freight wagons:\n");
                GenerateFreightWagons.generate();
                calc.calculateFreightWagon();
                break;

            default:
                System.out.println("Error!");
                chose();
                break;
        }
    }
}
