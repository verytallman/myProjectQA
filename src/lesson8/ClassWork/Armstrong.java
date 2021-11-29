package lesson8.ClassWork;

import java.util.Scanner;

public class Armstrong {

    public void armstrongChecker() {
        System.out.println("This is Armstrong program");
        System.out.print("Please enter a number:" + " ");
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        String num = String.valueOf(number);
        long sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Math.pow(num.charAt(i) - '0', num.length());
        }
        if (sum == number) {
            System.out.print(number + " is an armstrong number");
        } else {
            System.out.print(number + " is not an armstrong number");
        }
        System.out.println("bye");
    }
}
