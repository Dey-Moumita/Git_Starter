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
        if(copy%sum==0){
            System.out.println("Niven Number");
        }else{
            System.out.println("Not a Niven Number");
        }
    }
}
