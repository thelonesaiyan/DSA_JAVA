package com.kClasses.Day2;

import java.util.Scanner;

public class EvOd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        evod(num);
    }

    static void evod(int a){
        if(a%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
