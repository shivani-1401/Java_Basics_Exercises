package com.rbs.basics;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Radius");
        float radius = scan.nextFloat();
        System.out.println("Enter Output required");
        String opReq = scan.next();
        switch (opReq) {
            case "DIA":
                System.out.print("Diameter of circle is ");
                System.out.printf("%.2f", (2 * radius));
                break;
            case "AR":
                System.out.print("Area of circle is ");
                System.out.printf("%.2f", (Math.PI * radius * radius));
                break;
            case "PER":
                System.out.print("Perimeter of circle is ");
                System.out.printf("%.2f", (2 * Math.PI * radius));
                break;
            case "ARSEM":
                System.out.print("Area of semi circle is ");
                System.out.printf("%.2f", ((Math.PI * radius * radius) / 2));
                break;
        }

    }
}
