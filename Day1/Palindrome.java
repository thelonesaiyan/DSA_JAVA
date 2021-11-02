package com.kClasses;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // 121 = 121
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int res = 0;
        int n = num;
        while(num > 0){
            int rem = num % 10;
            res = res *10 + rem;
            num /= 10;
        }
        if(res == n){
            System.out.println("Pali");
        }
        else{
            System.out.println("No");
        }
    }
}
