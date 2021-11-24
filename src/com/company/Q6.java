package com.company;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //declaration of variables
        Scanner s = new Scanner(System.in);
        double num=0;

        System.out.println("enter a number please: ");
        num = s.nextDouble();   //-7.0
        if(num%1 == 0) //(num *10)%10 == 0
            num = (int)num; //-7
        if(num<0)
            System.out.println(-1*num);
        else
            System.out.println(num);
    }
}
