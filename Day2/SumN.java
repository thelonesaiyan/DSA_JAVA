package com.kClasses.Day2;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = sumTillN(n);
        System.out.println(sum);
    }

    static int sumTillN(int a){
        return (a*(a+1))/2;
    }
}
