package edu.moumita.practise;

import java.util.Scanner;

public class CheckNumberIsEvenOROdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        float num = scanner.nextFloat();

        if(num%2==0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
