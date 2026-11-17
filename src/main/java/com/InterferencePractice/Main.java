package com.InterferencePractice;

public class Main {
    public static void main(String[] args) {

        VehicleInterface.Vehicle car = new VehicleInterface.CarImpl();

        car.startup();
        car.stopit();

        VehicleInterface.Vehicle bike = new VehicleInterface.Bike();

        bike.startup();
        bike.stopit();

        PaymentWay.Payments cash = new  PaymentWay.Cash();
        PaymentWay.Payments CreditCard = new  PaymentWay.CreditCard();
        PaymentWay.Payments payPal = new  PaymentWay.PayPal();

        cash.pay(99);
        CreditCard.pay(999);
        payPal.pay(9);

        AnimalKingdomCome.Animals dumbo = new AnimalKingdomCome.Elephant();
        AnimalKingdomCome.Animals iago = new AnimalKingdomCome.Parrot();
        AnimalKingdomCome.Animals mufasa = new AnimalKingdomCome.Lion();

        dumbo.eat();
        dumbo.makeSound();

        iago.eat();
        iago.makeSound();

        mufasa.eat();
        mufasa.makeSound();

    }
}
