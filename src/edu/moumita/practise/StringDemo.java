package edu.moumita.practise;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first string : ");
//        String str = scanner.nextLine();
//       System.out.println("Enter the second string : ");
//        String str1 = scanner.nextLine();
//        System.out.println("The length of the input string is : "+str.length());
//        System.out.println("The string converts to uppercase : "+str.toUpperCase());
//        System.out.println("To check the content of two string is equal or not : "+str.equals(str1));
//        System.out.println("To check whether a string is empty or not : "+str.isEmpty());
//        System.out.println("Enter a character : ");
//        char character = scanner.next().charAt(0);
//        System.out.println("To check the input character in which index of the input string :"+str.indexOf(character));
        System.out.println("Enter a email : ");
        String str = scanner.nextLine();
        int index = str.indexOf('@')+1;
        System.out.println(str.substring(index));
//       String s1 = "Tree";
//        String s2 = "Tre";
//        System.out.println(s1.compareTo(s2));

    }
}























