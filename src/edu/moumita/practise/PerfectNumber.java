package edu.moumita.practise;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int copy = num;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if(sum==copy){
            System.out.println("It is a perfect number");
        }else{
            System.out.println("It's not a perfect number");
        }
    }
}
