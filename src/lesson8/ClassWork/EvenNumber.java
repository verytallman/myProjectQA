package lesson8.ClassWork;

import java.util.Scanner;

public class EvenNumber {
        public void evenOrOddNumber() {
            System.out.println("This is Even Number program!");
            System.out.println("It shows int is Even or Odd");
            Scanner scanner = new Scanner(System.in);
            System.out.print("ENTER YOUR INTEGER: ");
            String srt = "";
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("True");
            }else {
                System.out.println("False");
            }
            System.out.println("bye");
        }
    }
