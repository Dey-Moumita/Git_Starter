package edu.moumita.practise;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter the element no. : "+(i+1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = scanner.nextInt();
        int low =0;
        int high = arr.length-1;
        while(low<=high){
           int mid = low+(low+high)/2;//ekhane mid = (low+high)/2 lekha jete pare but ota 99.9% time chlbe but jeta lekha hyeche ota alaways run krbe
            if(arr[mid]==target){
                System.out.println("Search is successful & it's found at index"+mid);
                break;
            }else if(target<arr[mid]){
                high=mid -1;
            }else{
                low=mid+1;
            }
        }
    }
}
