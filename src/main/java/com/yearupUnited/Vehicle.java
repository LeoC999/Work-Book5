package com.yearupUnited;

public class Vehicle {
    String brand;
    double speed;
    String seats;
    String fuelType;

    public void enterVehicle() {
        System.out.println("entering car");
    }

    public void exitVehicle() {
        System.out.println("exiting car");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

