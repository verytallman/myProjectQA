package Lesson2;

import java.util.Objects;
import java.util.Scanner;

public class lesson21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR PASSWORD");
        String MetaString = scanner.nextLine();
        if (Objects.equals(MetaString, "Hi there, its me")) {
            System.out.println("Its ok");
        } else {
            System.out.println("Error");
        }
    }
}
