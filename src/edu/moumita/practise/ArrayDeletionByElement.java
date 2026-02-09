package edu.moumita.practise;

import java.util.Scanner;

public class ArrayDeletionByElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of this array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            System.out.println("Enter the element no. : "+(i+1));
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element which you want to delete : ");
        int element = scanner.nextInt();

        int index = 0;
        for(int i = 0;i<size;i++){
            if(arr[i]==element){
                index = i;
                break;
            }
        }

        for(int i = index;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        size--;

        for(int i = 0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
