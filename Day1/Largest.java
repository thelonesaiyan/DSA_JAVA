package com.kClasses;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = Integer.MIN_VALUE;
        if(num1 > num2 && num1 > num3){
            max = num1;
        }
        else if(num2 > num1 && num2 > num3){
            max = num2;
        }
        else{
            max = num3;
        }

        System.out.println("Max Element is : " + max);
    }
}
