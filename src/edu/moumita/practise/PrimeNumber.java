package edu.moumita.practise;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        boolean isPrime = true;
        for(int i =2;i<n;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
    }
}
