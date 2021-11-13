package org.lesson4;


public class ArraysInits {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[2] = 2;
//        arr[4] = 3;

//        int[] arr = {2345, 67, 34, 0};
//        int amountArr = arr.length;
//
//        arr[amountArr - 1] = 55;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }



//        int[] k = new int[]{1, 2, 3, 4};

//        int[] j = {5, 6, 7, 8, 9};
//        for (int num: j) {
//            System.out.println(num);
//        }




        String[] s = new String[]{"one", "two", "three", "four"};
        int amountChars = s.length;



        while (amountChars > 0){
            System.out.println(s[amountChars - 1]);
            amountChars--;
        }
        System.out.println("");
    }
}
