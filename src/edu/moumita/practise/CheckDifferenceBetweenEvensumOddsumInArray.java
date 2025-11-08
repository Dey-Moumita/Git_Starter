package edu.moumita.practise;

import java.util.Scanner;

public class CheckDifferenceBetweenEvensumOddsumInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter the element no. :"+(i+1));
            arr[i] = scanner.nextInt();
        }
        int evenSum = 0;
        int oddSum = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] % 2==0){
                evenSum = evenSum + arr[i];
            }else{
                oddSum = oddSum + arr[i];
            }
        }
        int result = evenSum-oddSum;
        System.out.println("The difference between the sum of even numbers and odd numbers is : "+result);
    }
}
