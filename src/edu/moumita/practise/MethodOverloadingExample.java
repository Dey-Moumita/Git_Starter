package edu.moumita.practise;

class Shape{
    private int length;
    private int breadth;
    private int side;
    private double radius;
    private double area;

    public void area(int side){
        area = (side*side);
        System.out.println("The area of a square is : "+area );
    }

    public void area(int length,int breadth){
        area=length*breadth;
        System.out.println("the area of the rectangle is : "+area);
    }

    public void area(double radius){
        area=Math.PI*radius*radius;
        System.out.println("The area of circle is : "+area);
    }
}
public class MethodOverloadingExample {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(4);
        Shape shape1 = new Shape();
        shape1.area(4,5);
        Shape shape3 = new Shape();
        shape3.area(3.0);
    }
}
