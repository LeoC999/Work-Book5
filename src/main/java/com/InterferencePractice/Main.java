package com.InterferencePractice;

public class Main {
    public static void main(String[] args) {
        VehicleInterface.Vehicle car = new VehicleInterface.CarImpl();
        car.startup();
        car.stopit();
        VehicleInterface.Vehicle bike = new VehicleInterface.Bike();
        bike.startup();
        bike.stopit();


    }
}
