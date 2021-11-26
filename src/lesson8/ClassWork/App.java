package lesson8.ClassWork;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EvenNumber task1 = new EvenNumber();
        Armstrong task2 = new Armstrong();




        Scanner scanner = new Scanner(System.in);
        int numberOfTask = scanner.nextInt();



        if (numberOfTask == 1){
            System.out.println("You have chosen Prog number "+numberOfTask);
            task1.evenOrOddNumber();
        }else if (numberOfTask == 2){
            System.out.println("You have chosen Prog number "+numberOfTask);
            task2.armstrongChecker();
        }
    }


}
