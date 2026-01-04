package edu.moumita.practise;

import java.util.Scanner;

class Employee{
    private String name;
    private int age;

    public void setEmployeeDetails(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
public class EmployeeDetailsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first employee name: ");
        String emp1 = scanner.nextLine();
        System.out.println("Enter the age of first employee is: ");
        int ageOfEmp1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the second employee name: ");
        String emp2 = scanner.nextLine();
        System.out.println("Enter the age of second employee is: ");
        int ageOfEmp2 = scanner.nextInt();


        Employee employee1 = new Employee();
        employee1.setEmployeeDetails(emp1,ageOfEmp1);
        System.out.println("The first employee name is: "+employee1.getName());
        System.out.println("The age of the first employee is: "+employee1.getAge());

        Employee employee2 = new Employee();
        employee2.setEmployeeDetails(emp2,ageOfEmp2);
        System.out.println("The second employee name is: "+employee2.getName());
        System.out.println("The age of the second employee is: "+employee2.getAge());



    }
}
