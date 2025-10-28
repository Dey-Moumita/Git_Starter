package edu.moumita.practise;

public class Pattern1 {
    public static void main(String[] args) {
        //int space = 0;
        for(int i = 1;i<=5;i++){
            for(int space = 0;space<i;space++){
                System.out.print("");
                for(int j =1;j<=4;j++){
                    System.out.print("*");
                }

            }

            System.out.println("*");
        }
    }
}
