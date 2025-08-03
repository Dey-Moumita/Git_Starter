package edu.moumita.practise;

import java.util.Scanner;

public class FindGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks of Mathematics(out of 100) :" );
        int m1 = scanner.nextInt();
        System.out.println("Enter your second marks of Physics(out of 100) :" );
        int m2 = scanner.nextInt();
        System.out.println("Enter your third marks of Chemistry(out of 100) :" );
        int m3 = scanner.nextInt();

        int avg = (m1 + m2 + m3)/3;

        if(avg >= 70){
            System.out.println("You got GRADE A");
        } else if(avg >= 60 && avg < 70){
            System.out.println("You got GRADE B");
        }else if(avg >= 50 && avg < 60){
            System.out.println("You got GRADE C");
        }else if(avg >= 40 && avg < 50){
            System.out.println("You got GRADE D");
        }else{
            System.out.println("You got F");
        }
    }
}
