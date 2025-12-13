package edu.moumita.practise;

import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of this array : ");
        int size =scanner.nextInt();
        int[] nums = new int[size];
        for(int i =0;i<nums.length;i++){
            System.out.println("enter the element no. in the array : "+(i+1));
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the target element : ");
        int targetElement = scanner.nextInt();
        boolean isFound = false;
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==targetElement){
                isFound=true;
                pos=i;
                break;
            }
        }
        if(isFound){
            System.out.println(targetElement+" is found at index "+pos);
        }else {
            System.out.println("Element is not found");
        }
    }
}
