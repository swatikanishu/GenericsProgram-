package com.generics;

public class FindMaxNum {

        public static  <T extends Comparable> T maxNumber(T num1, T num2, T num3) {
            if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
                return num1;
            } else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0) {
                return num2;
            } else
                return num3;
        }

        public static void main(String[] args) {
            System.out.println("Maximum number out of three integers is: " + maxNumber(31, 34, 400));
            System.out.println("Maximum number out of three float is: " + maxNumber(7.3f, 0.95f, 78f));
            System.out.println("Maximum among three string is: " + maxNumber("Apple", "Peach", "Banana"));
        }

    }

