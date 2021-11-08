package org.project;

import java.util.Scanner;

class HoursAndMinutes {

        public static void main(String[] args) {
            Scanner inScanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите количество часов");
            int Hours = inScanner.nextInt();
            System.out.println("Пожалуйста, введите количество минут");
            int Minutes = inScanner.nextInt();

            System.out.println(Hours * 60 + Minutes);
        }
    }
