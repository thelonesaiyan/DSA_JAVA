package com.kClasses;

import java.util.Scanner;

public class PermuCombi {
    public static int calFact(int n){
        int fact = 1;
        while(n > 0){
            fact *= n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        char choice = sc.next().trim().charAt(0);

        // ncr
        if(choice == 'c'){
            double nCr = (double) (calFact(n) / (calFact(r) * calFact(n-r)));
            System.out.println(nCr);
        }
        // npr
        else{
            double nPr = (double) (calFact(n)/calFact(n-r));
            System.out.println(nPr);
        }
    }
}
