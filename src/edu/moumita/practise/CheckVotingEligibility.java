package edu.moumita.practise;

import java.util.Scanner;

public class CheckVotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age to check if a person is eligible  to vote : ");
        int age = scanner.nextInt();

        if(age>=18){
            System.out.println("you are eligible");
        }else{
            System.out.println("you are not eligible");
        }
    }
}
