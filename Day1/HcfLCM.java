package com.kClasses;

import java.util.Scanner;

public class HcfLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Hcf
        int numerator;
        int denominator;
        if(num1 > num2){
            numerator = num1;
            denominator = num2;
        }
        else{
            numerator = num2;
            denominator = num1;
        }

        int rem = numerator%denominator;
        while(rem != 0){
            numerator = denominator;
            denominator = rem;
            rem = numerator%denominator;
        }

        int hcf = denominator;
        // lcm

        int lcm = (num1 * num2)/hcf;

        System.out.println(hcf);
        System.out.println(lcm);
    }
}
