package com.generics;


import java.util.Arrays;

public class FindMaxNum<T extends Comparable<T>> {
    private T[] inputArray;

    FindMaxNum(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public void testMaximum() {
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i].compareTo(inputArray[i + 1]) > 0) {
                inputArray[i + 1] = inputArray[i];
            }
        }

    }

    private void toPrint() {
        System.out.println(inputArray[inputArray.length - 1]);
    }

    public static void main(String[] args) {
        Integer[] i = {38, 40, 90};
        String[] s = {"Peach", "Banana", "Apple"};
        Float[] f = {1.56f, 3.30f, 6.37f};
        new FindMaxNum(i).testMaximum();
        new FindMaxNum(s).testMaximum();
        new FindMaxNum(f).testMaximum();
        new FindMaxNum(i).toPrint();
        new FindMaxNum(s).toPrint();
        new FindMaxNum(f).toPrint();

    }
}