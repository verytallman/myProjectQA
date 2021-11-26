package lesson8.ClassWork;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        System.out.println(evenOrOddNumber());
    }

    public static boolean evenOrOddNumber() {
        System.out.println("This is CheckOddEven program!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER YOUR INTEGER: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
