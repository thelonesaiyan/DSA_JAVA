package com.kClasses;

import java.util.Scanner;

public class ProdSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int prod =1, sum = 0;
        while(n > 0){
            sum += n%10;
            prod *= n%10;
            n /= 10;
        }
        System.out.println(prod);
        System.out.println(sum);
        System.out.println(prod-sum);
    }

}
