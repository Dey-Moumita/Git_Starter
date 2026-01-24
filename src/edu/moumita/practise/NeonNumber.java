package edu.moumita.practise;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        int square = num*num;
        int digit ;
        int sum = 0;
        while(square!=0){
            digit = square%10;
            square = square/10;

            sum = sum + digit;
        }
        if(sum==num){
            System.out.println(num +" is Neon number");
        }else{
            System.out.println(num +" is not a Neon number");
        }
    }
}
