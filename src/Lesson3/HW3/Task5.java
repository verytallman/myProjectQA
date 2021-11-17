package Lesson3.HW3;

//Write a program that outputs a reversible string (use an array of characters - char string [])


import java.util.Scanner;

public class Task5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        char[] arr = name.toCharArray();

        for(int i = 0;  i < arr.length; i++){
            System.out.print(arr[arr.length - i - 1]);
        }
    }
}