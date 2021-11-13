package org.lesson4;

public class SimpleLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }


        for (int i = 0, j = 10; i != j; i++, j--) {

            System.out.println(i + " " + j);

        }

        // show loop without incrementer
    }
}
