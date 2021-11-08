package org.project;

import java.time.Year;
import java.util.Scanner;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        int minutes = 3456789;
        int metaDays = 3456789 / 60 / 24 / 365; // 6.57684361
        int restOfDays = (int) (0.57684361 * 365); // - 210 часов остатка

            System.out.println(minutes+" minutes is approximately "+metaDays + " years"+" and "
                    +restOfDays+" days!");
    }
}
