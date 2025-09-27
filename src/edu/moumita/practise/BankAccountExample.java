package edu.moumita.practise;

import java.util.Scanner;

public class BankAccountExample {
    private int accNo;
    private String name;
    private double balance, rate, time, interest, finalAmount;


    public BankAccountExample(int acc, String n, double bal, double r, double t) {
        this.accNo = acc;
        this.name = n;
        this.balance = bal;
        this.rate = r;
        this.time = t;
    }

    public void calculateInterest() {
        interest = (balance * rate * time) / 100;
        finalAmount = balance + interest;

    }

    public void display() {
        System.out.println("Account no. is : " + accNo);
        System.out.println("The name of the account holder : " + name);
        System.out.println("The balance is : " + balance);
        System.out.println("The rate is : " + rate);
        System.out.println("Time is : " + time);
        System.out.println("Interest is : " + interest);
        System.out.println("the final ammount is : " + finalAmount);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the acc no :1234");
        int accNo = scanner.nextInt();
        System.out.println("Enter the name of account holder : ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the balance : ");
        double balance = scanner.nextDouble();
        System.out.println("Enter the rate : ");
        double rate = scanner.nextDouble();
        System.out.println("Enter the time : ");
        double time = scanner.nextDouble();
        BankAccountExample bankAccount = new BankAccountExample(accNo,name,balance,rate,time);
        bankAccount.calculateInterest();
        bankAccount.display();
    }
}


