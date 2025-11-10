package edu.moumita.practise;

import java.util.Scanner;

public class InsertingAnElementInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter the element no. : "+(i+1));
            arr[i]=scanner.nextInt();
        }

        int[] newArr = new int[size+1];
        System.out.println("Enter the element which you want to insert in the array : ");
        int element = scanner.nextInt();
        System.out.println("Enter the position where you want to insert the element : ");
        int pos = scanner.nextInt();

        for(int i=0;i<pos;i++){
            newArr[i] = arr[i];
        }
        newArr[pos] = element;
        for(int i=pos;i<arr.length;i++){
            newArr[i+1] = arr[i];
        }
        System.out.println("New array is : ");
        for(int i =0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}
