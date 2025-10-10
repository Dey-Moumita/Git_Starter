package edu.moumita.practise;

class Student{
    private String name;
    private int age;
    private String course;
    public Student(){
        this.name="unknown";
        this.age=0;
        this.course="not assigned";
    }
    public Student(String name){
        this.name=name;
        this.age=0;
        this.course="not assigned";
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
        this.course="not assigned";
    }
    public Student(String name,int age,String course){
        this.name=name;
        this.age=age;
        this.course=course;
    }
    public void display(){
        System.out.println("The name of the student is : "+name);
        System.out.println("The age of the student is : "+age);
        System.out.println("The name of the course is : "+course);
    }

}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Mou");
        Student s3 = new Student("Mou",21);
        Student s4 = new Student("Mou",21,"CSE");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
