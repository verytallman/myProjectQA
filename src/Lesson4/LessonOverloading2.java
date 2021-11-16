package Lesson4;

import java.util.Scanner;

public class LessonOverloading2 {
    public static void main(String[] args) {
        System.out.println(convertToAmount("Alex"));
    }
    public static int convertToAmount (String someString){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input required integer: ");
        return convertToAmount(someString, scanner.nextInt());
    }

    public static int convertToAmount (String someString, int someInt){
        return someString.length() * someInt;
    }
}
