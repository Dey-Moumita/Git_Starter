package edu.moumita.practise;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = scanner.nextInt();

        System.out.println("The addition of two numbers is : " + (num1 + num2));
        System.out.println("The difference between two numbers  is : " + (num1 - num2));
        System.out.println("The product of two numbers  is : " + (num1 * num2));
        System.out.println("The divide of two numbers  is : " + (num1 / num2));
    }
}