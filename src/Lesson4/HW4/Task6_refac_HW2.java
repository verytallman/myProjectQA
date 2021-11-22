package Lesson4.HW4;
//6.Написать программу которая будет сравнивать величину (magnitude) двух чисел.
// Например, если одно число = 3, а второе число = -9,
// программа должна выдать, что число -9 имеет большую величину.


import java.util.Scanner;

public class Task6_refac_HW2 {
    public static void main(String[] args) {
        System.out.println(magnitudeChecker());
    }

    public static String magnitudeChecker() {
        System.out.println("This is Magnitude comparison program!");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("ENTER YOUR FIRST INTEGER:");
        int firstNumber = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("ENTER YOUR SECOND INTEGER:");
        int secondNumber = scanner2.nextInt();
        if (Math.abs(firstNumber) > Math.abs(secondNumber)) {
            System.out.println("Число " + firstNumber + " имеет большую величину чем " + secondNumber + ".");
        } else if (Math.abs(firstNumber) < Math.abs(secondNumber)) {
            System.out.println("Число " + secondNumber + " имеет большую величину чем " + firstNumber + ".");
        } else {
            System.out.println("Число " + firstNumber + " равно " + secondNumber + ".");
            System.out.println("Числа равны.");
        } return "" ;
    }
}
