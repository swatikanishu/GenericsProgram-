package com.generics;
import java.util.Scanner;

public class FindMaxNum {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three Integer");
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();


    Integer i1 = x;
    Integer i2 = y;
    Integer i3 = z;

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
        System.out.println(y);
    } else if (result2 < 0) {
        System.out.println("Max for all three value are"+" "+z);
    } else if (result3>0){
        System.out.println("Max for all three value are"+" "+x);
    }
        else if(result3<0)
    {
        System.out.println("Max for all three value are"+" "+z);
    }
        else
    {
        System.out.println("Max for all three value are"+" "+x);
    }

}
}

