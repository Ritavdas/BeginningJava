package com.example.amihealthy;

public class BMI_Calculator {
    public static void main(String[] args) {
    double result = Calculations(53,1.67);
    System.out.println(result);
    }
    public static double Calculations(double mass,double height ){
        double BMI = mass/height;

        if (BMI<18.5){
            System.out.println("You're underweight");
        }
        if (BMI > 18.5 && BMI <= 25){
            System.out.println("You're pretty fit ! ");
        }
        if (BMI>25){
            System.out.println("You're overweight");
        }

        return BMI;
    }
}
