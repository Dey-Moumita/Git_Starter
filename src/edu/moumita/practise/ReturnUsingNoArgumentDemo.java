package edu.moumita.practise;

import java.util.Scanner;

class Addition{
    public int add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first & second number : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = (num1+num2);
        return sum;
    }
}
public class ReturnUsingNoArgumentDemo {
    public static void main(String[] args) {
        Addition obj = new Addition();
        int getresult = obj.add();
        System.out.println("The sum is : "+getresult);
    }
}
