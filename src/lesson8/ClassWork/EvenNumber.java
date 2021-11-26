package lesson8.ClassWork;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

    }

    public void evenOrOddNumber() {
        System.out.println("This is CheckOddEven program!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER YOUR INTEGER: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
