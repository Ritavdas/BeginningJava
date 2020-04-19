package com.example.javapractice;

public class MyClass {
    public static void main(String[] args) {
        int change = getMilk(2,15);
        System.out.println("Hello master , your change is: ₹" + change);
    }

    //    public static void getMilk() {
//        System.out.println("Open door");
//        System.out.println("Walk to store");
//        System.out.println("Buy milk");
//        System.out.println("Return home");
//    }
//    public static void getMilk(int nrOfCartons) {
//        int priceToPay = nrOfCartons * 3;
//        System.out.println("Open door");
//        System.out.println("Walk to store");
//        System.out.println("Buy " + nrOfCartons + " cartons of milk");
//        System.out.println("Price to pay is: " + priceToPay);
//        System.out.println("Return home");
//    }
    public static int getMilk(int nrOfCartons, int startingAmount) {
        int priceToPay = nrOfCartons * 3;
        System.out.println("Open door");
        System.out.println("Walk to store");
        System.out.println("Buy " + nrOfCartons + " cartons of milk");
        System.out.println("Price to pay is: " + priceToPay);
        System.out.println("Return home");
        return startingAmount-priceToPay;
    }

}

