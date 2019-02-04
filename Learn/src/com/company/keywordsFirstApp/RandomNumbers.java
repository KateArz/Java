package com.company.keywordsFirstApp;

import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of random numbers");
        int numbersQuentity = scanner.nextInt();
        int[] randomeArray = createIntArray(numbersQuentity);
        printArrayInOneLine(randomeArray);
        System.out.println();
        printWithNewLine(randomeArray);

    }

    public static int[] createIntArray(int size) {
        int[] randomArray = new int[size];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 1000);
        }
        return randomArray;
    }

    public static void printArrayInOneLine(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printWithNewLine(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
