package com.yearupUnited;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Car car = new Car();
car.brand = "Honda";
car.seats = "2";
car.speed = 70;
System.out.println("My car is a " + car.brand +  " it has this many seats: " + car.seats + " I usually go " + car.speed+ " on the highway.");

car.isTrunkOpen = true;
System.out.println(" yes it's " + car.isTrunkOpen()+ " my trunk is open");

    }
}