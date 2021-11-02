package com.kClasses;

import java.util.Scanner;

public class CalAverageN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        float avg = 0;
        int sum = 0;
        int total = n;

        while(n > 0){
            sum += sc.nextInt();
            n--;
        }

        avg = sum/total;
        System.out.println(avg);
    }
}
