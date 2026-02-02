package edu.moumita.practise;

import java.util.Scanner;

public class DeletingAnElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0;i<array.length;i++) {
            System.out.println("Enter the element no. : "+(i+1));
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the index no. which you want to delete : ");
        int index = scanner.nextInt();

        for(int i = index;i<size-1;i++){
            array[i] = array[i+1];
        }
        size--;

        for(int i = 0;i<size;i++){
            System.out.println(array[i]);
        }
    }
}
