package Lesson4.HW4;
//Write a method which returns an array of
//codes for given array of chars

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Please, enter your chars:");
        System.out.println(codeOfChar());

    }

    public static String codeOfChar (){
        int i;
        Scanner scanner = new Scanner(System.in);
        String charsEntered = scanner.nextLine();
        char [] arr = charsEntered.toCharArray();
        System.out.println("The number of chars: "+arr.length);
        int numberOfChars = charsEntered.length();
        for (i = 0; i < numberOfChars; i++){
            char characters = charsEntered.charAt(i);
            int ascii = characters;
            System.out.println("The ASCII code for "+"'"+characters+"'" +" is"+ " "+ascii+".");
        }
        return "";
    }
}
