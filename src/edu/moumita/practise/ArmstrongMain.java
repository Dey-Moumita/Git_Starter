package edu.moumita.practise;

import java.util.Scanner;

class Check{
    public boolean armstrong(int n){

        int copy = n;
        int digit = 0;
        int value = 0;
        int sum = 0;
        while(n>0){
            digit = n%10;
            n = n/10;
            value = digit*digit*digit;
            sum = sum +value;
        }
//        if(sum==copy){
//            return true;
//        }else{
//            return false;
//        }
        return sum==copy;
    }
}
public class ArmstrongMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three digit number to check it's armstrong or not : ");
       int  n = scanner.nextInt();
        Check check = new Check();
//        boolean result =check.armstrong(n);
//        System.out.println(result);
        System.out.println(check.armstrong(n));
    }
}
