package com.kClasses;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0, b = 1;
        n -= 2;
        System.out.print(a + " " + b + " ");
        while(n > 0) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            n-=1;
        }
    }
}
