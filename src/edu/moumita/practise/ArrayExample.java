package edu.moumita.practise;

import java.util.Scanner;


public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter the element : "+(i+1));
            arr[i] = scanner.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] % 2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("The even no. count is : "+evenCount);
        System.out.println("The odd no. count is : "+oddCount);
    }
}
