package com.InterferencePractice;

public class VehicleInterface {
    interface Vehicle{
        void startup();
        void stopit();
    }
    static class CarImpl implements Vehicle{
        public void startup(){
            System.out.println("Car engine coming to life!");
        }
        public void stopit(){
            System.out.println("Car engine stopping!");
        }
    }
    static class Bike implements Vehicle{
        public void startup(){
            System.out.println("Bike engine coming to life!");
        }
        public void stopit(){
            System.out.println("Bike engine stopping!");
        }
    }
}
