package edu.moumita.practise;

import java.util.Scanner;

public class DeletionMultipleElementsInArray {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
                // Scanner object to take input from keyboard

                // 1. Ask user to enter the length of the array
                System.out.print("Enter array length: ");
                int n = sc.nextInt();
                // 'n' stores the size of the array

                int[] arr = new int[n];
                // Create an array of size 'n'

                // 2. Take array elements from the user
                System.out.println("Enter array elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    // Store each input value into the array
                }

                // 3. Ask how many contiguous elements to delete
                System.out.print("Enter number of elements to delete: ");
                int deleteCount = sc.nextInt();
                // Number of elements that will be removed

                // 4. Ask for starting index from where deletion begins
                System.out.print("Enter starting index: ");
                int index = sc.nextInt();
                // Index position from which deletion will start

                // Validation: check if index or delete count is invalid
                if (index < 0 || index + deleteCount > n) {
                    System.out.println("Invalid index or delete count!");
                    return;
                    // Stop execution if input is wrong
                }

                // 5. Delete elements by shifting remaining elements to the left
                for (int i = index; i < n - deleteCount; i++) {
                    arr[i] = arr[i + deleteCount];
                    // Move elements from right to left to overwrite deleted values
                }

                // 6. Print the new array after deletion
                System.out.println("New array:");
                for (int i = 0; i < n - deleteCount; i++) {
                    System.out.print(arr[i] + " ");
                    // Print only valid elements after deletion
                }


    }
}
