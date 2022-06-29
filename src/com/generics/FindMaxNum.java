package com.generics;


import java.util.Arrays;

public class FindMaxNum <T extends Comparable<T>> {
    private T[] inputArray;
    FindMaxNum(T[] inputArray) { //generics method to accept Type from generics class array
        this.inputArray = inputArray;//converting into this method object
    }
    public void maxElement() {
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i].compareTo(inputArray[i + 1]) > 0) {
                inputArray[i + 1] = inputArray[i];
            }
        }
        System.out.println(inputArray[inputArray.length - 1]);
    }
    public void display() {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
        Arrays.sort(inputArray);
        System.out.println("After Sorting");
        for(int i =0; i< inputArray.length ; i++){
            System.out.println(inputArray[i]);
        }
    }
    public static void main(String[] args) {

        Integer[] i = {276, 310, 701, 923, 430, 32};
        String[] s = {"Peach", "Banana", "Apple", "Grapes"};
        Float[] f = {0.93f, 0.30f, 8.670f, 00.10f};
        System.out.println("*******integer******");
        new  FindMaxNum(i).display();
        System.out.println("*******String******");
        new  FindMaxNum(s).display();
        System.out.println("*******Float******");
        new  FindMaxNum(f).display();
        System.out.println("Maximum From Three Value");
        new  FindMaxNum(i).maxElement();
        new  FindMaxNum(s).maxElement();
        new  FindMaxNum(f).maxElement();


    }
}