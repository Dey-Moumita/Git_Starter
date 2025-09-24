package edu.moumita.practise;

public class ConstructorDemo {
    private String name;
    private int rollNo;
    public ConstructorDemo(String name,int rollNo){
        this.name= name;
        this.rollNo=rollNo;
    }

    public static void main(String[] args) {
        ConstructorDemo obj1 = new ConstructorDemo("Mou",3);
        ConstructorDemo obj2 = new ConstructorDemo("moumita",5);
        System.out.println(obj1.name);
        System.out.println(obj1.rollNo);
        System.out.println(obj2.name);
        System.out.println(obj2.rollNo);
    }
}
