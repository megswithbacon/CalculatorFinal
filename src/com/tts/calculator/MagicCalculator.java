package com.tts.calculator;

public class MagicCalculator extends Calculator{

    public static double sqrt(double num){
        return Math.sqrt(num);
    }

    public static double sin(double num) {
        return Math.sin(num);
    }

    public static double cos(double num) {
        return Math.cos(num);
    }

    public static double tan(double num) {
        return Math.tan(num);
    }

    public static double log(double num){ return Math.log(num); }

    public static double factorial(double num){
        double finalNumber = 1;
        for (double i = 2; i <= num ; i++){
            finalNumber *= i;
        }
        return finalNumber;
    }
}
