package edu.moumita.practise;

import java.util.Scanner;

class CheckNumber {
    public boolean checkPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;

            }


        }
        if (isPrime == true) {
            // System.out.println("The number is prime");
            return true;
        } else {
            //System.out.println("The number is not prime");
            return false;
        }
    }

//public void checkPrime(int n){
//    boolean isPrime = true;
//    int count = 0;
//    for(int i = 2;i<n;i++){
//        if(i % n==0){
//            isPrime = false;
//        }else{
//            count++;
//        }
//    }
//    if(count == 2){
//        System.out.println("The number is prime");
//    }else{
//        System.out.println("The number is not prime");
//    }
//}

        public boolean checkPalindrome ( int n){
            int copy = n;
            int digit;
            int rev = 0;
            while (n > 0) {
                digit = n % 10;
                n = n / 10;
                rev = rev * 10 + digit;
            }
//        if (rev == copy) {
//            return true;
//        } else {
//            return false;
//        }
            return rev == copy;

        }

        public int findFactorial (int n){
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }

        public int reverseNumber (int n){
            //int copy = n;
            int digit;
            int rev = 0;
            while (n > 0) {
                digit = n % 10;
                n = n / 10;
                rev = rev * 10 + digit;
            }
            return rev;
        }
    }


    public class MethodDemo {
        public static void main(String[] args) {
            CheckNumber check = new CheckNumber();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int n = scanner.nextInt();
            System.out.println("Press 1 to check prime number:\nPress 2 to check palindrome number:\nPress 3 to find factorial of a number:\nPress 4 to find reverse number:\nEnter a choice : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(check.checkPrime(n));
                    break;
                case 2:
                    System.out.println(check.checkPalindrome(n));
                    break;
                case 3:
                    System.out.println(check.findFactorial(n));
                    break;
                case 4:
                    System.out.println(check.reverseNumber(n));
                    break;
                default:
                    System.out.println("EXIT");
            }

        }

    }



