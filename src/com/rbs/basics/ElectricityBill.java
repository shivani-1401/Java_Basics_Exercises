package com.rbs.basics;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the previous reading");
        int preReading = scan.nextInt();
        System.out.println("Enter the current reading");
        int currReading = scan.nextInt();
        int unitConsumed = currReading - preReading;
        double billAmount = 0.0;
        if (unitConsumed < 30) {
            billAmount = (unitConsumed * 2.30);
        } else if ((unitConsumed > 30) && (unitConsumed <= 100)) {
            billAmount = ((30 * 2.30) + ((unitConsumed - 30) * 3.50));
        } else if (unitConsumed > 100) {
            billAmount = ((30 * 2.30) + (70 * 3.50) + ((unitConsumed - 100) * 4.60));
        }
        System.out.print("Bill Amount is ");
        System.out.printf("%.2f", billAmount);

    }
}
