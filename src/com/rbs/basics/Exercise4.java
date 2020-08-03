package com.rbs.basics;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = scan.nextInt();
        int max = scan.nextInt();
        for (int i = min; i <= max; i++) {
            if (i % 9 == 0) {
                System.out.println(i);
            }
        }

    }
}
