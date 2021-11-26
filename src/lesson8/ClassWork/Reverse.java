package lesson8.ClassWork;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        char[] arr = inputStr.toCharArray();
        int i;
        for (i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
