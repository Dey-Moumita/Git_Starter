package edu.moumita.practise;

import java.util.Scanner;

public class ProductOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        int product = 1;
        for(int i = 1;i<=num;i++){
            product = product * i;
        }
        System.out.println("The product of all elements : "+product);
    }
}
