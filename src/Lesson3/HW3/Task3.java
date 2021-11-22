package Lesson3.HW3;

//Write a program that finds the minimum value in an array

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Minimum value in given array: "+minimumAndMaximumValueInArray());
    }
    public static int minimumAndMaximumValueInArray () {
        int[] arr = {126127, 4, 1261, 112316, 2, 1488, -4, -1231, -12};
        int min = arr[0];
        for(int j=1; j<arr.length; j++) {
            if(min>arr[j]) {
                min= arr[j];
            }
        }
        return min;
    }
}
