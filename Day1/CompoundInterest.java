package com.kClasses;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        float r = sc.nextFloat();
        int t = sc.nextInt();
        int n = sc.nextInt();

        float num = (1+(r/n));
        int power = (n*t);
        double CI = P*(Math.pow(num, power));

        System.out.println(CI);

        System.out.println(5000*Math.pow((1 + 0.05 / 12),12*(10)));

    }
}
