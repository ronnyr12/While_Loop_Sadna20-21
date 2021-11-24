package com.company;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        int total = 0, sum = 0;
        double avg = 0;
        int flag = 1;
        Scanner s = new Scanner(System.in);

        while (flag == 1) {
            System.out.println("enter grade: ");
            int grade = s.nextInt();
            if(grade>=50 && grade <= 90) {
                total++;
                sum += grade;
            }
            System.out.println("do you want to enter another  grade? yes enter:< 1 > , no enter evaey other number  ");
            flag = s.nextInt();
        }
        avg = (double) sum / total;
        System.out.println("the average of sudents that their grade is between 50 to 90 is: "+avg);
    }
}
