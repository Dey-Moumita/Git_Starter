package edu.moumita.practise;

import java.util.Scanner;

public class FindNivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int copy = num;
        int sum = 0;
        int digit ;
        while(num!= 0){
            digit = num%10;
            num = num/10;
            sum = sum + digit;
        }
        //sum % copy means the sum of digits by the number itself and check the remainder.
        //This is wrong for Niven numbers, because the definition is about the number being divisible by the sum of its digits, not the other way around.
        if(copy%sum==0){//divide the number by the sum of its digits and check the remainder.
            System.out.println("Niven Number");
        }else{
            System.out.println("Not a Niven Number");
        }
    }
}
