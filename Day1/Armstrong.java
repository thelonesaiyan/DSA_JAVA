package com.kClasses;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = n;
        // 153 = 1^3 + 5^3 + 3^3 = 153
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }

        n = num;

        int res = 0;
        while(num > 0){
            int rem = num%10;
            res += Math.pow(rem, count);
            num /= 10;
        }

        if(res == n){
            System.out.println(res);
        }
        else{
            System.out.println("Not");
        }
    }
}
