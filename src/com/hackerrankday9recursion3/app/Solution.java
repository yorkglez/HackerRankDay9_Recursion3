package com.hackerrankday9recursion3.app;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        //Variables declaration
        int number = 0;
        int factorial = 1;
        //Object declaration
        Scanner in = new Scanner(System.in);
        //Input number
        number = in.nextInt();

        //Factorial process
        factorial = factorial(number);
        //Output Factorial
        System.out.println(factorial);

    }

    static int factorial(int number)
    {
        if(number == 0)
        {
            return  1;
        }
        else
        {
            return number * factorial(number - 1);
        }
    }
}
