package HW2;

//2.Написать программу с названием “CheckOddEven”, которая печатает “Odd Number”
// если переменная “number” типа int нечетная.
// Или “Even Number” если переменная четная. Программа всегда должна перед выходом печатать “BYE”

import java.util.Scanner;

public class Task2_refac_HW2 {
    public static void main(String[] args) {
        System.out.println(evenOrOddNumber());

    }

    public static int evenOrOddNumber () {
        System.out.println("This is CheckOddEven program!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER YOUR INTEGER: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.print("Even Number ");
        } else {
            System.out.print("Odd Number ");
        }
        return number;
    }

}
