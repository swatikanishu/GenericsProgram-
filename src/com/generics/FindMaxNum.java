package com.generics;
import java.util.Scanner;

public class FindMaxNum {
    public static  <E extends Comparable> E findMaximum(E a, E b, E c){
        E max=a;
        if(b.compareTo(a)>0 && b.compareTo(c)>0){
            max=b;
        }else if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
    public static void main(String[] args){
        System.out.println("Welcome to Test Maximum Program");
        Scanner sc=new Scanner(System.in);

        //Max value for integer
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println(findMaximum(x,y,z));

        //Max value for float
        float x1=sc.nextFloat();
        float y1=sc.nextFloat();
        float z1=sc.nextFloat();
        System.out.println(findMaximum(x1,y1,z1));

        //Max value for string
        String x3=sc.next();
        String y3=sc.next();
        String z3=sc.next();
        System.out.println(findMaximum(x3,y3,z3));

    }
}