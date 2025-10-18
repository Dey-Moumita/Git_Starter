package edu.moumita.practise;

class Rectangle{
    private double length;
    private double breadth;
    private double area;
    public Rectangle(){
        this.length=1;
        this.breadth=1;
    }
    public Rectangle(double length){
        this.length=length;
        this.breadth=1;
    }
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void area(){
        area=length*breadth;
        System.out.println("The area of the rectangle : "+area);
    }

}
public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.area();
        Rectangle rectangle1 = new Rectangle(5);
        rectangle1.area();
        Rectangle rectangle2 = new Rectangle(5,7.8);
        rectangle2.area();

    }
}
