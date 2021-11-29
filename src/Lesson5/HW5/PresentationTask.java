package Lesson5.HW5;

//Write a method that accepts two
//parameters: mode of type String and length
//of type int. This function should return a randomly
//generated string of given length according to
//the specified mode. Modes: alpha, numeric, alphanumeric. Output —> String.

import java.util.Scanner;

public class PresentationTask {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("1. Numeric");
        int a = 1;
        System.out.println("2. Alpha");
        int b = 2;
        System.out.println("3. AlphaNumeric");
        int c = 3;
        System.out.print("Please, enter desirable result:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        if (input == a){
            System.out.println(getNumeric(n));
        }else if (input == b){
            System.out.println(getAlphaString(n));
        }else if (input == c){
            System.out.println(getAlphaNumericString(n));
        }
    }


    static String getNumeric (int n) {
        String Numeric = "0123456789";
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int) (Numeric.length() * Math.random());
            sb.append(Numeric.charAt(index));
        }return sb.toString();
    }

    static String getAlphaString(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }return sb.toString();
    }

    static String getAlphaNumericString(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }

}
