package edu.moumita.practise;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("The year is leap year");
        }
        else{
            System.out.println("The year is not leap year");
        }
    }
}
