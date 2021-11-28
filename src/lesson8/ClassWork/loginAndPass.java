package lesson8.ClassWork;

import java.util.Objects;
import java.util.Scanner;

public class loginAndPass {
    public static void main(String[] args) {

    }
    public static void loginAndPassChecker (){
        System.out.println("Please, enter your login");
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();
        System.out.println("Please, enter your Password");
        String passwordInput = scanner.nextLine();
        String desiredPass = "Administrator123";
        String desiredString = "Admin";
        if (Objects.equals(stringInput, desiredString) && Objects.equals(passwordInput, desiredPass)){
            System.out.println("Login successful");
            System.out.println("Please, chose one of the programs on the list below:");
            System.out.println("1. Even Number");
            System.out.println("2. Armstrong");
            System.out.println("3. Reverse");
            System.out.println("4. Fibonacci");
            System.out.println("5. Replace");
            Scanner scanner2 = new Scanner(System.in);
            int numberOfTask = scanner2.nextInt();
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

        }else {
            System.out.println("Error, please try again");
        }

    }
}
