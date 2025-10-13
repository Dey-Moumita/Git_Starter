package edu.moumita.practise;

import java.util.Scanner;

public class ProductExample {

    int productId;
    String productName;
    double price,discount,finalPrice;

    public ProductExample(int id,String name,double p){
        this.productId=id;
        this.productName=name;
        this.price=p;
    }

    public  void calculateDiscount(){
        if(price>10000){
            discount=0.15*price;
        }else{
            discount=0.05*price;
        }

        finalPrice=price-discount;
    }

    public void display(){
        System.out.println("The productId is : "+productId);
        System.out.println("the name of the product : "+productName);
        System.out.println("The price of the product : "+price);
        System.out.println("The discount will be : "+discount);
        System.out.println("The final price of the product after discount is : "+finalPrice);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product id : ");
       int productId = scanner.nextInt();
       scanner.nextLine();
        System.out.println("Enter the product name : ");
       String productName= scanner.nextLine();
        System.out.println("Enter the price of the product : ");
        int price = scanner.nextInt();
        ProductExample obj = new ProductExample(productId,productName,price);
        obj.calculateDiscount();
        obj.display();
    }
}
