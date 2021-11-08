package org.project;

public class randomGenerator {
    public static void main(String[] args) {
        int d = (int) (Math.random() * (100 - 1) + 1); //double d = Math.random() * (max - min) + min;
        System.out.println(d);
    }

}
