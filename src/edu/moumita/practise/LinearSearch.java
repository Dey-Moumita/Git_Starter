package edu.moumita.practise;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter the element no : "+(i+1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = scanner.nextInt();
        boolean isFound = false;
        for(int i = 0;i<arr.length;i++){
           if(arr[i]==target) {
               isFound= true;
               break;
           }

        }
        if(isFound){
            System.out.println("Element is found");
        }else{
            System.out.println("Element is not found");
        }

    }
}
