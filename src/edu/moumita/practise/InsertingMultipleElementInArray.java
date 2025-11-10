package edu.moumita.practise;

import java.util.Scanner;

public class InsertingMultipleElementInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element no. in the array : "+(i+1));
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the no. of elements which you want to enter : ");
        int num = scanner.nextInt();
        int[] newElements = new int[num];
        for(int i =0;i<newElements.length;i++){
            System.out.println("Enter the element no. in the array : "+(i+1));
            newElements[i] = scanner.nextInt();
        }

        System.out.println("Enter the position where you want to enter the new element array : ");
        int pos = scanner.nextInt();

        int[] result = new int[size+num];
        for(int i =0;i<pos;i++){
            result[i] = arr[i];
        }
        for(int i=0;i<newElements.length;i++){
            result[pos+i] = newElements[i];
        }
        for(int i =pos;i<arr.length;i++){
            result[i+num] = arr[i];
        }

        System.out.println("Result array is : ");
        for(int i =0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
