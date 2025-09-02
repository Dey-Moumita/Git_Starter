package edu.moumita.practise;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();//124
        int digit;
        int rev = 0;
        while(num>0){
            digit = num%10;//digit always age neoa uchit krn amder sb digit lgbe//124%10=4
            num = num/10;//age divide kore dile last digit ta lost hye jbe//124/10=12
            rev = rev*10+digit;
        }
        System.out.println(rev);
    }
}
