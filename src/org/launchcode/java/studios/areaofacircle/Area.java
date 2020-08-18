package org.launchcode.java.studios.areaofacircle;
//package org.launchcode.java.studios.areaofacircle.Circle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Double radius;
        Double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius");
        radius = input.nextDouble();
        input.close();

        //area = (Math.PI * radius * radius);
        area = Circle.getArea(radius);
        System.out.println("The area is: " + area);
    }
}
