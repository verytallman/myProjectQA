package Lesson3.HW3;

//Write a program that finds the minimum value in an array

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {6128354, 12612, 1231, 5125125, 1251, 124316, 1744, 1488, 152151};
        Arrays.sort(arr);
        System.out.println("Minimum value in an array " + arr[0]);
    }
}
