package com.kClasses.Day2;

import java.util.Scanner;

public class Pytha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean isP = pythTrip(a, b, c);
        if(isP)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static boolean pythTrip(int a, int b, int c){
        int sum1 = a*a + b*b;
        int sum2 = b*b + c*c;
        int sum3 = c*c + a*a;

        if(sum1 == c*c || sum2 == a*a || sum3 == b*b)
            return true;
        else
            return false;
    }
}
