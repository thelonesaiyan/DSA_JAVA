package com.kClasses.Day2;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        boolean eligible = vote(age);

        if(eligible)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static boolean vote(int a){
        return a >= 18;
    }
}
