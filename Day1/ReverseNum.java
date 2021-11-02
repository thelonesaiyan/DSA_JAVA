package com.kClasses;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 0;

        while (n > 0) {
            int rem = n % 10;
            num = num*10 + rem;
            n /= 10;
        }
        System.out.println(num);
    }
}
