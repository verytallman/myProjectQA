package lesson8.ClassWork;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfTask = scanner.nextInt();

        if (numberOfTask == 1) {
            EvenNumber task1 = new EvenNumber();
            System.out.println("You have chosen Prog number " + numberOfTask);
            task1.evenOrOddNumber();
        } else if (numberOfTask == 2) {
            Armstrong task2 = new Armstrong();
            System.out.println("You have chosen Prog number " + numberOfTask);
            task2.armstrongChecker();
        } else if (numberOfTask == 3) {
            Reverse task3 = new Reverse();
            System.out.println("You have chosen Prog number " + numberOfTask);
            task3.reverseStr();
        } else if (numberOfTask == 4) {
            Fibonacci task4 = new Fibonacci();
            System.out.println("You have chosen Prog number " + numberOfTask);
            task4.fibonacciChecker();
        }else if (numberOfTask == 5) {
            Replace task5 = new Replace();
            System.out.println("You have chosen Prog number " + numberOfTask);
            task5.symbolReplacement();
        }

    }
}
