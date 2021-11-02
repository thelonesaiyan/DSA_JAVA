package com.kClasses.Day2;

import java.util.Scanner;

public class SumNUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = sumNum(num1, num2);
        System.out.println(sum);

        int prod = prodNum(num1, num2);
        System.out.println(prod);
    }

    static int sumNum(int a, int b){
        return a + b;
    }

    static int prodNum(int a, int b){
        return a * b;
    }
}
