package com.company;

/*
 * a 3 points extra (in the next quiz)
 * to every student that solves this question with only 2 variables
 * solution will accept only in the mashov via github or pastebin.com
 */
public class Q7 {
    public static void main(String[] args) {
        int prev=1, current=1, num3 = 0;
        System.out.print(prev +" "+ current+" ");
        while((prev +current)<50){
            num3 = prev + current;
            System.out.print(num3 + " ");
            prev = current;
            current = num3;
        }

    }
}
