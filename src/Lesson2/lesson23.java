package Lesson2;

import java.util.Scanner;

public class lesson23 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("ENTER YOUR LOGIN: ");
//        String metaLogin = scanner.nextLine();
//        System.out.print("ENTER YOUR PASSWORD: ");
//        String metaPass = scanner.nextLine();
//        if (Objects.equals(metaLogin, "Yourii")) {
//            System.out.println("You successfully loggined in!");
//        } else {
//            System.out.println("ERROR");
//        }
//        if (Objects.equals(metaPass, "Pass")) {
//            System.out.println("You successfully loggined in!");
//        } else {
//            System.out.println("ERROR");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String username = scanner.nextLine();
        String expUserName = "Max";
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        String expPassName = "QWEqwe";

        String Answer1 = (username.equals(expUserName)) ? "Успешный логин" : "Логин запрещен";
        System.out.println(Answer1);
        String Answer2 = (password.length() == expPassName.length()) ? "Пароль корректный" : "Пароль неверный";
        System.out.println(Answer2);

    }
}