package Lesson5.HW5;

//1. Upper/Lower case change
//Change given text into all upper case or lower case or change the first letter of each word (or
//sentence) to upper and the rest to lower, etc.



import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(allUpperCaseConverter());
    }

    public static String allUpperCaseConverter() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int i;
        StringBuffer outputString = new StringBuffer(inputString);
        for (i = 0; i < inputString.length(); i++) {
            if (Character.isLowerCase(inputString.charAt(i))){
                outputString.setCharAt(i,Character.toUpperCase(inputString.charAt(i)));
            } else if (Character.isUpperCase(inputString.charAt(i))){
                outputString.setCharAt(i,Character.toLowerCase(inputString.charAt(i)));
            }
        }
        System.out.println("Converted string is: "+outputString);
        return "";
    }
}
