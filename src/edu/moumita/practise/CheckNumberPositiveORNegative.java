package edu.moumita.practise;

import java.util.Scanner;

public class CheckNumberPositiveORNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it is positive or negative:");
        long number = scanner.nextLong();

        if(number > 0){
            System.out.println("The number is positive");
        }
        else if(number<0){
            System.out.println(("The number is negative"));
        }
        else{
            System.out.println("The number is zero");
        }

    }
}

