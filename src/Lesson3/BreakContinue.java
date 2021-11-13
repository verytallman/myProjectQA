package org.lesson3;

public class BreakContinue {



    public static void main(String[] args) {
//        int i;
//        for (i = 0; i < 5; i++) {
//            if (i >= 2) {
//                break;
//            }
//            System.out.println("Hello V");
//        }
//        System.out.println("Counter equals to: " + i);

        int i;
        for (i = 0; i < 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
