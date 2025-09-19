package edu.moumita.practise;


import java.util.Scanner;

class Subtraction{
    public int sub(int num1,int num2) {
        int difference = (num1 - num2);
        return difference;
    }
}
public class ReturnusingArgumentDemo {
    public static void main(String[] args) {
        Subtraction subtraction = new Subtraction();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first & second number : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(subtraction.sub(num1,num2));


    }
}
