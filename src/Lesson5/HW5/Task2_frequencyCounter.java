package Lesson5.HW5;

//2. Count letters
//Count the single character frequencies


import java.util.Scanner;

public class Task2_frequencyCounter {
    public static void main(String[] args) {
        System.out.println(frequencyCounter("qqww"));
    }

    public static String frequencyCounter(String string) {

        int[] arr1 = new int[string.length()];
        System.out.println("The entered string is " + string);
        char arr2[] = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            arr1[i] = 1;
            for (int j = i + 1; j < string.length(); j++) {
                if (arr2[i] == arr2[j]) {
                    arr1[i]++;
                    arr2[j] = '0';
                }
            }
        }
        System.out.println("Frequencies of the characters in the string are: ");
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] != ' ' && arr2[i] != '0')
                System.out.println(arr2[i] + " " + arr1[i]);
        }
        return "";
    }
}
