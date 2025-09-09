package edu.moumita.practise;

import java.util.Scanner;

public class PrintEvenDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int digit;
        while(num!=0){
            digit = num%10;
            num = num/10;
            if(digit%2==0){
                System.out.println(digit);
            }
        }
    }
}
