package edu.moumita.practise;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        int copy = n;
        int digit;
        int rev =0;
        while(n>0){
            digit = n%10;
            n = n/10;
            rev = rev*10+digit;
        }
        if(rev==copy){
            System.out.println("It is a palindrome number");
        }else{
            System.out.println("It is not a palindrome number");
        }
    }
}
