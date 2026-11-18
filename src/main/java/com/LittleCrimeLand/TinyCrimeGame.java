package com.LittleCrimeLand;

public class TinyCrimeGame {
    // INTERFACE: unrelated classes can share behavior
    interface Damageable {
        void takeDamage(int amount);
    }

    // ABSTRACT CLASS: cannot create Vehicle directly
    static abstract class Vehicle {
        private String name;

        public Vehicle(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        // ABSTRACT METHOD: subclasses must provide behavior
        public abstract void drive();
    }

    // INHERITANCE: Car is a Vehicle
    static class Car extends Vehicle {

        public Car(String name) {
            super(name); // INHERITANCE: call parent constructor
        }

        // METHOD OVERRIDING
        @Override
        public void drive() {
            System.out.println(getName() + " speeds through the streets.");
        }
    }

    // INHERITANCE: Motorcycle is a Vehicle
    static class Motorcycle extends Vehicle {

        public Motorcycle(String name) {
            super(name);
        }

        // METHOD OVERRIDING
        @Override
        public void drive() {
            System.out.println(getName() + " weaves through traffic.");
        }
    }
    static class Helicopter extends Vehicle {
        public Helicopter(String name) {
            super(name);
        }
        @Override
        public void drive() {
            System.out.println(getName() + " safely drives the helicopter.");
        }
    }

    // ABSTRACT CLASS
    static abstract class Character implements Damageable {

        private String name;

        // ENCAPSULATION: private field
        private int health;

        public Character(String name, int health) {
            this.name = name;
            this.health = health;
        }

        public String getName() {
            return name;
        }

        public int getHealth() {
            return health;
        }

        // ENCAPSULATION: health can never go below 0
        @Override
        public void takeDamage(int amount) {
            health -= amount;

            if (health < 0) {
                health = 0;
            }

            System.out.println(name + " health: " + health);
        }

        public abstract void act();
    }

    // INHERITANCE: Player is a Character
    static class Player extends Character {

        private int money;

        // COMPOSITION: Player HAS-A Vehicle
        private Vehicle vehicle;

        public Player(String name, int health, int money) {
            super(name, health);
            this.money = money;
        }

        public void stealVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            System.out.println(getName() + " steals the " + vehicle.getName());
        }

        public Vehicle getVehicle() {
            return vehicle;
        }

        // ENCAPSULATION: controlled way to earn money
        public void earnMoney(int amount) {
            if (amount > 0) {
                money += amount;
            }
        }

        @Override
        public void act() {
            System.out.println(getName() + " is looking for trouble.");
        }
    }

    // INHERITANCE: Police is a Character
    static class Police extends Character {

        private int wantedLevel;

        public Police(String name, int health, int wantedLevel) {
            super(name, health);
            this.wantedLevel = wantedLevel;
        }

        @Override
        public void act() {
            System.out.println(
                    getName() + " is chasing criminals. Wanted level: "
                            + wantedLevel);
        }
    }

    public static void main(String[] args) {

        Player player = new Player("Rex Steele", 100, 50);

        Vehicle stolenCar = new Car("Thunder Coupe");
        Vehicle bike = new Motorcycle("Street Hawk");

        Police police = new Police("Officer Vega", 100, 2);

        System.out.println("=== Crime City Scene ===");

        player.stealVehicle(stolenCar);

        player.getVehicle().drive();

        System.out.println("\nPolymorphism Demo:");

        // POLYMORPHISM: same parent type, different behavior
        Vehicle[] vehicles = { stolenCar, bike };

        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
        }

        System.out.println("\nCharacters:");

        // POLYMORPHISM: same parent type, different behavior
        Character[] characters = { player, police };

        for (Character character : characters) {
            character.act();
        }

        System.out.println("\nPolice catch up!");

        player.takeDamage(25);

    }
}
