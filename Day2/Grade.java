package com.kClasses.Day2;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mark = sc.nextInt();
        gradeM(mark);
    }
    
    static void gradeM(int a){
        switch (a){
            case 1: System.out.println("AA");
                break;
            case 2:System.out.println("AB");
            break;
            case 3:System.out.println("BB");
            break;
            case 4: System.out.println("BC");
            break;
            case 5: System.out.println("CD");
            break;
            case 6 : System.out.println("DD");
            break;
            default: System.out.println("Fail");
                break;
        }
    }
}
