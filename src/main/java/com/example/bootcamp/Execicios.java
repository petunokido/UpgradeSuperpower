package com.example.bootcamp;

public class Execicios {

    /*OVERLOAD METHOD OR FUNCTION*/

    static int plusMethod(int x, int y)
    {
        return x + y;
    }

    static double plusMethod(double x, double y)
    {
        return x + y;
    }
    public static void main(String [] args)

    {
        int num1 = plusMethod(8,5);
        double num2 = plusMethod(8.1, 9.1);
        System.out.println("int : " + num1);
        System.out.println("double : " + num2);
    }

}
