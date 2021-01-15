package com.tts.calculator;

public class Calculator {

    //takes 2 integers and adds them together
    public static int add(int num1, int num2){
        return num1 + num2;
    }

    //takes 2 integers and subtracts them together
    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    //takes 2 integers and multiplies them together
    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }

    //takes 2 integers and divides them
    public static int division(int num, int dividedBy){
        return num / dividedBy;
    }

    //calculates num to the xToTheY second int
    public static double xToTheY(double x, double y){
        return Math.pow(y, x);
    }

    //takes int and squares it
    public static int square(int num){
        return num * num;
    }
}
