package com.kClasses;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // is it a perfect number
        int sum = 0;
        for(int i=1; i<=n/2; i++){
            if(n%i == 0) {
                sum += i;
            }
        }
        if(sum == n){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        // all perfect numbers between a range
        int range = sc.nextInt();

        for(int j=2; j<=range; j++){
            int sol = 0;
            for(int i=1; i<=j/2; i++){
                if(j%i == 0) {
                    sol += i;
                }
            }
            if(sol == j) {
                System.out.println( j + "Yes");
            }
        }
    }
}
