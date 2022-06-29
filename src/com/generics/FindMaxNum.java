package com.generics;


    public class FindMaxNum<T extends Comparable<T>>{
        public T num1, num2, num3;

        public FindMaxNum(T num1, T num2, T num3) {
            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;
        }

        public FindMaxNum() {
        }

        public static <T extends Comparable<T>> T maxNumber(T num1, T num2, T num3) {
            if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
                return num1;
            } else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0) {
                return num2;
            } else
                return num3;
        }
        public <T extends Comparable <T>> T testMaximum() {
            return (T) FindMaxNum.maxNumber(num1, num2, num3);
        }



    public static void main(String[] args) {
        FindMaxNum compareInteger = new FindMaxNum(7278, 412, 17);
        System.out.println("Maximum number out of three integers is: " + compareInteger.testMaximum());
        FindMaxNum comapreFloat = new FindMaxNum (671.f, 0.289f, 1.456f);
        System.out.println("Maximum number out of three float is: " + comapreFloat.testMaximum());
        FindMaxNum compareString = new FindMaxNum("Apple", "Grapes", "Banana");
        System.out.println("Maximum among three string is: " + compareString.testMaximum());
    }
}

