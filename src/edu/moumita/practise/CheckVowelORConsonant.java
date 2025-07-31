package edu.moumita.practise;

import java.util.Scanner;

public class CheckVowelORConsonant {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character for check it's vowel or not : ");
        char character = scanner.next().charAt(0);
        //character = Character.toLowerCase(character);

        if(character == 'A' || character == 'E' || character == 'I' || character == 'O' ||character ==  'U'||
                character == 'a' || character == 'e' || character == 'i' || character == 'o' ||character ==  'u' ){
            System.out.println(character + " is a vowel");
        }
        else{
            System.out.println(character + " is a constant");
        }
    }
}

