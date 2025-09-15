package edu.moumita.practise;

import java.util.Scanner;

class SimpleInterest{

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount :");
        int principal = scanner.nextInt();
        System.out.println("Enter the time limit :");
        int time = scanner.nextInt();
        System.out.println("Enter the rate of interest :");
        int rate = scanner.nextInt();
        calculate(principal,rate,time);
    }
    public void calculate(int principal,int rate,int time){
        int simpleinterest = (principal*rate*time)/100;
            output(simpleinterest,principal);
   }
    public void output(int simpleInterest,int principal){
        int total = simpleInterest + principal;
        System.out.println(total);
    }
}
public class SimpleInterestMain {
    public static void main(String[] args) {
        SimpleInterest simpleInterest = new SimpleInterest();
        simpleInterest.input();
        //simpleInterest.calculate();
       // simpleInterest.output(simpleInterest,principal);
        //System.out.println("The simple interest is :"+simpleInterest);
//        simpleInterest.output();
//        System.out.println(total);

    }

}
