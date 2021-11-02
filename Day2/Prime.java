package com.kClasses.Day2;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();

        printPrime(range);
    }

    static void printPrime(int n){
        for(int i=2; i<n; i++){
            boolean isPrime = true;
            for(int j=2; j*j <= i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(i);
        }
    }
}
