package edu.moumita.practise;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit : ");
        int lowerLimit = scanner.nextInt();
        System.out.println("Enter the upper limit : ");
        int upperLimit = scanner.nextInt();
        int sum = 0;
        for(int i = lowerLimit;i<=upperLimit;i++){
            sum = sum + i;
        }
        System.out.println("The sum of all the elements : "+sum);
    }
}
