package com.InterferencePractice;

public class PaymentWay {
    interface Payments {
         void pay(double amount);
    }

    static class PayPal implements Payments {
        public void pay(double amount) {
            System.out.println("Payment method PayPal Spent $" + amount);
        }
    }

    static class CreditCard implements Payments {
        public void pay(double amount) {
            System.out.println("Payment method CreditCard spent $" + amount);
        }
    }

    static class Cash implements Payments {
       public void pay(double amount) {
            System.out.println("Payment method Cash has spent $" + amount);
        }
    }
}





