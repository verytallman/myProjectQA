package Lesson3.HW3;

//Write a program that sorts an array from minimum to maximum

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, -4, -5, -6, 4, 5, 6};
        int temp = 0;
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted from minimum to maximum order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}