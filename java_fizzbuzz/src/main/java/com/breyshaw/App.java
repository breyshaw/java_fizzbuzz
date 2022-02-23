package com.breyshaw;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        int number = scanner.nextInt();
        // I had originally had the following more complex if statement last before the
        // else. This was breaking my code when entering a number divisible by both 3 &
        // 5 because it would stop executing at the first true statement.
        //The following refactor makes the code more dry but introduces nested if statements which could be a bad thing if overused.
        if (number % 5 == 0) {
            if (number % 3 == 0) {
                System.out.println("Fizzbuzz");
            } else {
                System.out.println("Fizz");
            }
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}

// Have the user enter a number
// If the number is divisible by 5, we get fizz
// If the number is divisible by 10, we get fizz
// If the number is divisible by 3, we get buzz
// If the number is divisible by 5 and 3 we get fizzbuzz
// If it is divisible by none, it returns the number entered
