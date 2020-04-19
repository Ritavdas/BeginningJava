package com.example.couldthisbelove;

import java.util.Random;

public class LoveCalculator {
    public static void main(String[] args) {
        int score = ifYouHadMyLove(" "," ");
        System.out.println("Your love score is: "+ score);

    }
    public static int ifYouHadMyLove(String YourName,String HerName){

         Random randObject = new Random();
        int loveScore = randObject.nextInt(101);

        if (loveScore > 90) {
            System.out.println("That's amazing "+YourName+" " + HerName +" are made for each other ");
        }
        else if (loveScore>70){
            System.out.println(YourName+" and "+ HerName+ " Will have small quarrels but will have a beautiful time together ");
        }
        else if (loveScore>50){
        System.out.println("Its okay " +YourName+" and "+ HerName+ " you may have a happy relationship but with struggles");
        }
        else if (loveScore>25){
            System.out.println("It'll be very difficult to have a happy relationship but even Rome was'nt built in a day");
        }
        else {
            System.out.println("I think its a big world and you'll someone, but this ain't it!!");
        }
        return loveScore;
    }
}
