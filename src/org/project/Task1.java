package org.project;

import java.util.Scanner;

class Task {
    public static void main(String[] args) {

        int currentYear = 3126;
        int birthDate = currentYear - 8;

        Scanner inScanner = new Scanner(System.in);

        System.out.println("Please, enter your age and press Enter");
        String name = inScanner.nextLine();
        System.out.println("День рождения моего друга:" + birthDate);
    }

}