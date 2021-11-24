package com.company;

import java.util.Scanner;

public class Q1_BagrutQuestions {
    public static void main(String[] args) {
        //declaration of variables
        Scanner s = new Scanner(System.in);
        int capacity=0,weight=0, height=0;

        System.out.println("enter the parking lot capacity: ");
        capacity = s.nextInt();
        System.out.println("enter the car height:" );
        height = s.nextInt();
        System.out.println("enter the parking car weight :");
        weight = s.nextInt();

        if(weight<10 && height<5){
            System.out.println("the car can enter");
        }else
            System.out.println("cant enter, too high or too heavy");

    }
}
