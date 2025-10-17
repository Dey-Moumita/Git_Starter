package edu.moumita.practise;

class BankAccount{
   private int accNo;
    private String name;
    private double balance,rate,time,interest,finalAmount;
    //double CalculateInterest;

    public BankAccount(int acc,String n,double bal,double r,double t){
        this.accNo=acc;
        this.name=n;
        this.balance=bal;
        this.rate=r;
        this.time=t;
    }

    public void calculateInterest(){
        interest=(balance*rate*time)/100;
       finalAmount=balance+interest;

    }
    public void display(){
        System.out.println("Account no. is : "+accNo);
        System.out.println("The name of the account holder : "+name);
        System.out.println("The balance is : "+balance);
        System.out.println("The rate is : "+rate);
        System.out.println("Time is : "+time);
        System.out.println("Interest is : "+interest);
        System.out.println("the final ammount is : "+finalAmount);
    }
}

public class ParameterizedConstructorExample {
    public static void main(String[] args) {
        BankAccount bankAccount =new BankAccount(1276543,"Moumita",55000,3.5,2);
        bankAccount.calculateInterest();
        bankAccount.display();
    }

}
