package Lesson4;

import java.util.Scanner;

public class lesson4Main {
    public static void main(String[] args) { // String!!!
        // System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]) ); string --> int
        System.out.println("Input Some String: ");
        String stringFromUser = getStringFromScanner();
    //    System.out.println(getIntegerFromScanner());

        int lengthOfString = countStringLength(stringFromUser);
        System.out.println("U've entered this string: "+ stringFromUser + " and length of this string is: "+
                lengthOfString);
        System.out.println(stringBuilder("Hello ", stringFromUser));
        String  someString = stringBuilder("qweqwe", "asdasd");

    }

    public static String getStringFromScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static int getIntegerFromScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static Integer countStringLength(String someString) {
        return someString.length();
    }
    public static String stringBuilder (String firstString, String secondString){
        return firstString.concat(secondString);
    }
}
