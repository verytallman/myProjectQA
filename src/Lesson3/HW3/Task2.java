package Lesson3.HW3;

//Program to print the elements of an array in reverse order
//In this program, we need to print the elements of the array in reverse order that is; the last element should be displayed first, followed by second last element and so on.
//
//Program to print the elements of an array in reverse order
//int[] = {1, 2, 3, 4, 5}
//OR
//String[] = {"one", "two", "three", "four"}

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Using String's");
        String[] arr = new String[]{"one", "two", "three", "four", "five", "six"};
        int amountChars = arr.length;
        String[] reversed = new String[amountChars];
        while (amountChars > 0) {
            System.out.println(arr[amountChars - 1]);
            reversed[6 - amountChars] = arr[amountChars - 1];
            amountChars--;
        }
            int[] arr2 = {1, 2, 3, 4, 5,};
            int index = arr2.length;
            int[] reversed2 = new int[index];
        System.out.println("Using int's");
            while (index > 0){
                System.out.println(arr2[index - 1]);
                reversed2[5 - index] = arr2[index - 1];
                index--;
            }

        }
    }
