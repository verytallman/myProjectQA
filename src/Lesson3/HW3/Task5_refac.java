package Lesson3.HW3;

//Write a program that outputs a reversible string (use an array of characters - char string [])


import java.util.Scanner;

public class Task5_refac {
    public static void main(String[] args) {

        String reversibleString = reversibleStringMaker();
    }

    public static String reversibleStringMaker() {
        System.out.println("Please, enter your String to reverse: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        char[] arr = name.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[arr.length - i - 1]);
        }return " ";
    }
}