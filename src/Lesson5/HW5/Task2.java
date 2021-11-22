package Lesson5.HW5;

//2. Count letters
//Count the single character frequencies


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();
        int stringLength = stringInput.length();

    }

    public static String frequencyCounter () {
        
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();
        int stringLength = stringInput.length();
        char charArray [] = stringInput.toCharArray();
        for (int i = 0; i < stringLength; i++) {
            for (int j = i + 1; j < stringLength; j++) {
                if (charArray[i] == charArray[j]) {
                    System.out.print(charArray[j]);
                }
            }
        }return "";
    }
}
