package org.project;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите значение градусов Фаренгейта");
        int tF = inScanner.nextInt();
        int tC = (tF - 32) * 5 / 9;

        System.out.println("Текущее значение по Цельсию: " + tC);
    }
}
