package edu.moumita.practise;

import java.util.Scanner;

public class PrintNumberstill100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        for(int i = num;i<=100;i++){
            System.out.println(i);
        }
    }
}
