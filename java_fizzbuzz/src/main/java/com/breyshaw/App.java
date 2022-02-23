package com.breyshaw;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        int number = scanner.nextInt();
        System.out.println(number);
    }
}


//Have the user enter a number
//If the number is divisible by 5, we get fizz
//If the number is divisible by 10, we get fizz
//If the number is divisible by 3, we get buzz
//If the number is divisible by 5 and 3 we get fizzbuzz
//If it is divisible by none, it returns the number entered
