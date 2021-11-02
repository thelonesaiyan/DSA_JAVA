package com.kClasses.Day2;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = Maximum(num1, num2, num3);
        System.out.println(max);
    }

    static int Maximum(int a, int b, int c){
        if(a>b && a>c)
            return a;
        else if(b>a && b>c)
            return b;
        else
            return c;
    }
}
