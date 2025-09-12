package edu.moumita.practise;

import java.util.Scanner;

class CheckNumberForEvenOdd {
    public char CheckNumber(int num) {
        if (num % 2 == 0) {
            //System.out.println("E");
            return 'E';
        } else {
            //System.out.println("O");
            return 'O';
        }
    }
}
public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check even or odd : ");
        int num = scanner.nextInt();
        CheckNumberForEvenOdd check = new CheckNumberForEvenOdd();
        System.out.println(check.CheckNumber(num));

    }

}



