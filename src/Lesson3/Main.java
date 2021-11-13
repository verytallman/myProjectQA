package org.lesson4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[][] someArray = new int[3][4];
//        someArray[0][0] = 0;
//        someArray[0][1] = 1;
//        someArray[0][2] = 2;
//        someArray[0][3] = 3;
//        someArray[1][0] = 4;
//        someArray[1][1] = 5;
//        someArray[1][2] = 6;
//        someArray[1][3] = 7;
//        someArray[2][0] = 8;
//        someArray[2][1] = 9;
//        someArray[2][2] = 10;
//        someArray[2][3] = 11;

        int[][] someArray1 = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(" " + someArray1[i][j] + " ");
            }
        }

    }
}
