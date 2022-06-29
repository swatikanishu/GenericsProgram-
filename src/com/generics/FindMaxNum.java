package com.generics;
import java.util.Scanner;

public class FindMaxNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three string");
        String i1 = sc.nextLine();
        String i2 = sc.nextLine();
        String i3 = sc.nextLine();


        int result1 = i1.compareTo(i2);
        int result2=0;
        int result3=0;
        if (result1 < 0) {
            result2 = i2.compareTo(i3);
        } else if (result1 > 0) {
            result3 = i1.compareTo(i3);
        } else {
            result2 = i1.compareTo(i3);
        }
        if (result2 > 0) {
            System.out.println(i2);
        } else if (result2 < 0) {
            System.out.println("Max for all three value are"+" "+i3);
        } else if (result3>0){
            System.out.println("Max for all three value are"+" "+i1);
        }
        else if(result3<0)
        {
            System.out.println("Max for all three value are"+" "+i3);
        }
        else
        {
            System.out.println("Max for all three value are"+" "+i1);
        }

    }
}

