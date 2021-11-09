package HW2;

//3.Написать программу с названием “PrintNumberInWord”, которая напечатает “ONE”, “TWO”, ..., “NINE”, “OTHER”
//если переменная “number” типа int будет 1, 2, 3, 4, ... 9, или любой другой. Решить задачу двумя способами:
//1) с использованием if..else if
//2) с использованием switch-case

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("This is PrintNumberInWord program using switch-case method!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER YOUR INTEGER:");
        int number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
        System.out.println("This is PrintNumberInWord program using if...else if method!");
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("ENTER YOUR INTEGER:");
        int number2 = scanner.nextInt();
        if (number2 == 1){
            System.out.println("ONE");
        }else if (number2 == 2) {
            System.out.println("TWO");
        }else if (number2 == 3) {
            System.out.println("THREE");
        }else if (number2 == 4) {
            System.out.println("FOUR");
        }else if (number2 == 5) {
            System.out.println("FIVE");
        }else if (number2 == 6) {
            System.out.println("SIX");
        }else if (number2 == 7) {
            System.out.println("SEVEN");
        }else if (number2 == 8) {
            System.out.println("EIGHT");
        }else if (number2 == 9) {
            System.out.println("NINE");
        }else {
            System.out.println("OTHER");
        }
    }
}