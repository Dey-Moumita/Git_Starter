package edu.moumita.practise;

import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();//124
        int count=0;
        while(n!=0){// here also use while(n>0)
            n = n/10;//124/10=12//12/10=1//1/10=0
            count++;//1//2//3

        }
        System.out.println(count);//3
    }
}
