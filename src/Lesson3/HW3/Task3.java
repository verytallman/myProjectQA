package Lesson3.HW3;

//Write a program that finds the minimum value in an array

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {126127, 4, 1261, 112316, 2, 1488, -4, -1231,-12};
        int min = arr[0];
        for(int j=1; j<arr.length; j++) {
            if(min>arr[j]) {
                min= arr[j];
            }
        }
        System.out.println("Minimum value in given array: "+min);
    }
}
