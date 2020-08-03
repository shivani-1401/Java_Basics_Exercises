package com.rbs.basics;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        int firstNum = 2;
        int secondNum = 1;
        int thirdNum = 3;
        System.out.print("2 1 3 ");
        int sum = 0;
        while ((firstNum + secondNum + thirdNum) <= max) {
            System.out.print((firstNum + secondNum + thirdNum) + " ");
            sum = firstNum + secondNum + thirdNum;
            firstNum = secondNum;
            secondNum = thirdNum;
            thirdNum = sum;
        }
    }
}

