package com.TechIT.Abstract;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name of shape: ");
        String shape = scan.next();


         if(!(shape.equals("Rectangle")) && !(shape.equals("Circle")))
        {
            System.out.println("Invalid option");

        }


                  if(shape.equals("Circle"))
                 {

                     c.setRadius(5.0);
                     System.out.println("Enter the radius: "+c.getRadius());
                     System.out.println("Area of circle: " +c.aos());
                     System.out.println("Perimeter of circle" +c.pos());

                 }
                 else if(shape.equals("Rectangle"))
                 {
                     r.setWidth(6.0);
                     r.setHeight(8.0);
                     System.out.println("Enter the widht: "+r.getWidth());
                     System.out.println("Enter the height: "+r.getHeight());
                     System.out.println("Area of rectable: "+r.aos());
                     System.out.println("Perimeter of rectanlge: "+r.pos());


                 }


         }



    }


