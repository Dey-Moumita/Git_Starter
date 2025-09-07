package edu.moumita.practise;

import java.util.Scanner;

class Calculate{
    public void calculate(int a,int b,int choice){
        switch(choice){
            case 1:
                System.out.println("The sum of two numbers are : "+(a+b));
                break;
            case 2:
                System.out.println("The difference of two numbers are : "+(a-b));
                break;
            case 3:
                System.out.println("The product of two numbers are : "+(a*b));
                break;
            case 4:
                System.out.println("The division of two numbers are : "+(a/b));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int b = scanner.nextInt();
        System.out.println("Enter 1 for addition: ");
        System.out.println("Enter 2 for subtraction: ");
        System.out.println("Enter 3 for multiplication: ");
        System.out.println("Enter 4 for division: ");
        System.out.println("Enter the choice : ");
        int choice = scanner.nextInt();
        Calculate calculate = new Calculate();
        calculate.calculate(a,b,choice);

    }
}
