package com.test;

/**
 * Created by yoyor on 12/9/2017.
 */
public class OOP_Examples {

    /**
     * Problem 11:
     * Inheritance is useful for setting the base standard
     * for any object that wants to claim that it is the
     * type of the original object. For example, if we have
     * the base class Human, and a new class called
     * "Shane" extends Human (e.g. Shane wants to claim to be a
     * human), then when Shane extends Human, he is
     * guaranteed to have the base requirements for a human
     * (four arms, mammal, can think, act on free will, etc).
     */


    //Problems 10 and 12
    public class Automobile {
        int numWheels;
        int topSpeed;
        String make;
        String model;
        String color;
        public Automobile(int numWheels, int topSpeed,
                          String make, String model,
                          String color) {
            this.numWheels = numWheels;
            this.topSpeed = topSpeed;
            this.make = make;
            this.model = model;
            this.color = color;
        }

        public void honk() {
            System.out.println("Beep Beep!");
        }

        public void description() {
            System.out.println("This is a " + color
                    + " " + numWheels + " wheel "
                    + " " + make + " " + model
                    + " with a top speed of " + topSpeed);
        }
    }

    public class Car extends Automobile {
        public Car(int topSpeed,
                   String make, String model,
                   String color) {
            //Didn't make sense to have a standard top speed, make, model, or
            // color
            super(4, topSpeed, make, model, color);
        }
    }

    public class SemiTruck extends Automobile {
        public SemiTruck(int topSpeed,
                   String make, String model,
                   String color) {
            super(4, topSpeed, make, model, color);
        }
    }

    public class Motorcycle extends Automobile {
        public Motorcycle(int topSpeed,
                         String make, String model,
                         String color) {
            super(2, topSpeed, make, model, color);
        }
    }

}
