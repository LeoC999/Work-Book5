package com.yearupUnited;

public class Car extends Vehicle {
    int numberOfDoors;
    boolean isTrunkOpen;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isTrunkOpen() {
        return isTrunkOpen;
    }

    public void setTrunkOpen(boolean trunkOpen) {
        isTrunkOpen = trunkOpen;
    }
}



