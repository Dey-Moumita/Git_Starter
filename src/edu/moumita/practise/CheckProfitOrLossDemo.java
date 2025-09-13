package edu.moumita.practise;

import java.util.Scanner;

class CheckDemo{
    public String check(int costPrice,int sellingPrice){
        if(sellingPrice>costPrice){
            return "profit";
        }else if(sellingPrice<costPrice){
            return "loss";
        }else{
            return "No Profit No Loss";
        }
    }
}


public class CheckProfitOrLossDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost price : ");
        int costPrice = scanner.nextInt();
        System.out.println("Enter the selling price : ");
        int sellingPrice = scanner.nextInt();
        CheckDemo checkdemo = new CheckDemo();
        System.out.println(checkdemo.check(costPrice,sellingPrice));

    }

}
