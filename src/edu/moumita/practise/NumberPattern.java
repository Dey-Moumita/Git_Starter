package edu.moumita.practise;

public class NumberPattern {
    public static void main(String[] args) {
        int i=1;

        for( i =1;i<=4;i++){
            int maxspace = 4-i;
            for(int space =1;space<=maxspace;space++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }

            for(int j =i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
