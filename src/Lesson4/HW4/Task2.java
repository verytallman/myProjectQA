package Lesson4.HW4;
//Write a method which returns the sum of a
//given array

public class Task2 {
    public static void main(String[] args) {
        System.out.println("The sum of a given array is: " + sumOfArray());

    }

    public static int sumOfArray() {
        int [] arr = {1,12,612,1488};
        int sumOfArray = 0;
        for (int i = 0; i < arr.length; i++){
            sumOfArray = sumOfArray + arr[i];
        }
        return sumOfArray;
    }
}