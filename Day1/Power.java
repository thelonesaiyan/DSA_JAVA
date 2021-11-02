package com.kClasses;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();
        int res =1;
        while(p > 0){
            res *= n;
            p--;

        }
        System.out.println(res);
    }
}
