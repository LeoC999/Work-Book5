package com.InterferencePractice;

public class AnimalKingdomCome {
    interface Animals {
        void eat();
        void makeSound();
    }
    static class Lion implements Animals {
        public void eat() {
            System.out.println("Mufasa's eatting everything ");
        }
        public void makeSound() {
            System.out.println("Mufasa's lets out a powerful Roar! ");
        }
    }
    static class Elephant  implements Animals {
        public void eat() {
            System.out.println("Dumbo's eatting the Trees! ");
        }
        public void makeSound() {
            System.out.println("Dumbo's nose sounds like a saxophone! ");
        }
    }
    static class Parrot implements Animals {
        public void eat() {
            System.out.println("Iago's learned bird seed! ");
        }
        public void makeSound() {
            System.out.println("Iago's chirps sound just like me. ");
        }
    }
}
