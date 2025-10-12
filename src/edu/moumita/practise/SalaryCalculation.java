package edu.moumita.practise;

public class SalaryCalculation {
    private String name;
    private double basicPay,specialAlw,conveyanceAlw,gross,pf,netSalary,annualSal;

    public SalaryCalculation(String empName,double basic){
        this.name=empName;
        this.basicPay=basic;
        this.conveyanceAlw=1000.00;
    }

    public void salaryCal(){
        specialAlw = 0.25 * basicPay;
         pf=0.11 *basicPay;
         gross=basicPay+specialAlw+conveyanceAlw;
        netSalary=gross-pf;
        annualSal=12*netSalary;
    }

    public void display(){
        System.out.println("The name of the employee : "+name);
        System.out.println("The basic pay of the employee is : "+basicPay);
        System.out.println("The special allowance of the employee is : "+specialAlw);
        System.out.println("The pf of the employee is : "+pf);
        System.out.println("The gross of the employee is : "+gross);
        System.out.println("The net salary of the employee is : "+netSalary);
        System.out.println("The annual salary of the employee is : "+annualSal);

    }

    public static void main(String[] args) {
        SalaryCalculation obj = new SalaryCalculation("Moumita",70000);
        obj.salaryCal();
        obj.display();
    }

}
