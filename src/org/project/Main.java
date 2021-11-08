package org.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // int g;
        //g = 1;
        //    System.out.println(g++);
        //    System.out.println(++g);
        //    System.out.println(g--);
      //  System.out.println(--g);

    //    int x = 10, z = 10;
    //    x++; // x = 11 (пока он не выполнить вычесление)
    //    ++z; // z = 11 (до его вызова)

    //    System.out.println("x: " + x + ",z: "+ z);

        Scanner inScanner = new Scanner(System.in); // in - inputStream
        System.out.println("Please, enter your name and press Enter");
        String name = inScanner.nextLine();
        System.out.println("Enter your age");
        int age = inScanner.nextInt();

        System.out.println("Hello " + name + " your age is " + age);
    }
}

