package HW2;

//4.Написать программу, которая сравнивает два числа типа int и определяет, какое из чисел большее, а какое меньшее.
// Программа должна вывести что-то типа “The number x has the greatest value”. Где “x” одно из чисел

import java.util.Scanner;

public class Task4_refac_HW2 {
    public static void main(String[] args) {
        System.out.println(intComparison());

    }

    public static String intComparison() {
        System.out.println("This is Number Comparison program!");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("ENTER YOUR FIRST INTEGER:");
        int firstNumber = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("ENTER YOUR SECOND INTEGER:");
        int secondNumber = scanner2.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println("The number " + firstNumber + " has the greatest value than " + secondNumber + ".");
        } else if (firstNumber < secondNumber) {
            System.out.println("The number " + secondNumber + " has the greatest value than " + firstNumber + ".");
        } else {
            System.out.println("The numbers are even.");
        }
        return "";
    }
}
