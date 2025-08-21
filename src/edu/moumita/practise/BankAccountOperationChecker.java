package edu.moumita.practise;

import java.util.Scanner;

public class BankAccountOperationChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount : ");
        int amount = scanner.nextInt();
        System.out.println("Enter the balance : ");
        int balance = scanner.nextInt();
        System.out.println("Press 1 for WITHDRAW\nPress 2 for DEPOSIT\nEnter the choice : ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1 : if(amount>balance){
                System.out.println("Insufficient funds");
            }
            else{
                System.out.println("Withdraw successful");
            }
            break;

            case 2 : if(amount>100000){
                System.out.println("KYC needed");
            }
            else{
                System.out.println("Deposit successful");
            }
            break;

            default:
                System.out.println("INVALID CHOICE");
        }
    }
}
