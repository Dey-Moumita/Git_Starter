package edu.moumita.practise;

import java.util.Scanner;

class AdditionDemo{
    public void add(int num1,int num2){//ekhane num1rnum2 ekta copy asbe
        int sum = num1+num2;
        System.out.println("The sum is : "+sum);

    }
}
public class NoReturnUsingArgumentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();

        AdditionDemo additiondemo = new AdditionDemo();
        additiondemo.add(num1,num2);
    }
}
