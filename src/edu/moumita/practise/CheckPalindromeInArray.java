package edu.moumita.practise;

import java.util.Scanner;
public class CheckPalindromeInArray {
    public static boolean checkPalindrome(int num) {
        int copy = num;
        int digit;
        int rev = 0;
        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            rev = rev * 10 + digit;
        }
        //if (copy == rev)
            // return true;
            return copy==rev;
//        } else {
//            return false;
//        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] newArr = new int[10];
        int[] arr = new int[10];
        int j =0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the element no. :" + (i + 1));
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (checkPalindrome(arr[i])==true) {
                newArr[j++] =arr[i];
                //System.out.println(arr[i] + " is a palindrome");
            }
        }
        for(int i = 0; i < 10; i++){
            if(newArr[i]!=0){
                System.out.println(newArr[i]);
            }
        }
    }
}
