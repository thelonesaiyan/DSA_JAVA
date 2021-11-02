package com.kClasses;

import java.util.Scanner;

public class User0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxi = Integer.MIN_VALUE;
        int num = sc.nextInt();
        while(num != 0){
            if(num > maxi) {
                maxi = num;
            }
            num = sc.nextInt();
        }
        System.out.println(maxi);
    }
}
