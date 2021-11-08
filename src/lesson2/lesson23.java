package lesson2;

import java.util.Objects;
import java.util.Scanner;

public class lesson23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER YOUR LOGIN: ");
        String metaLogin = scanner.nextLine();
        System.out.print("ENTER YOUR PASSWORD: ");
        String metaPass = scanner.nextLine();
        if (Objects.equals(metaLogin, "Yourii")) {
            System.out.println("You successfully loggined in!");
        } else {
            System.out.println("ERROR");
        }
        if (Objects.equals(metaPass, "Pass")) {
            System.out.println("You successfully loggined in!");
        } else {
            System.out.println("ERROR");
        }
    }
}