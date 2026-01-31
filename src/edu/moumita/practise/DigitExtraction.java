package edu.moumita.practise;
import java.util.Scanner;
public class DigitExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        System.out.println("Digits are shown in below : ");
        int q;
        int digit = 0;
        while(num!=0){
            //digit = num%10;
            // num = num/10;
            q = num/10;
            digit = num%10;
            num = q;

            System.out.println(digit);
        }


    }
}
