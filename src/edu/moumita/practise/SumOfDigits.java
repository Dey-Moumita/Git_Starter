package edu.moumita.practise;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int digit ;
        int sum = 0;
        while(num!=0){
            num = num/10;
            digit = num%10;
            sum = sum + digit;

        }
        System.out.println("The sum of all the digits is : "+sum);
    }
}
