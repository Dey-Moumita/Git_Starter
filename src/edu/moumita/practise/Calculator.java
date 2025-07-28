package edu.moumita.practise;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = scanner.nextInt();

        System.out.println("The sum of two numbers is : " + (num1 + num2));
        System.out.println("The subtraction of two numbers  is : " + (num1 - num2));
        System.out.println("The multiplication of two numbers  is : " + (num1 * num2));
    }
}