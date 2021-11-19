package Lesson4.HW4;
//Write method which returns True or False if
//a given number is even or odd

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        int number = scan.nextInt();
        boolean result = evenOrOdd(number);
        System.out.println(result);
    }

    public static boolean evenOrOdd(int a) {
        if (a % 2 == 0){
            return true;
        }else  {
            return false;
        }

    }
}

