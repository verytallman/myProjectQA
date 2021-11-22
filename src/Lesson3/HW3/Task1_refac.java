package Lesson3.HW3;

//Program to print the duplicate elements of an array
//In this program, we need to print the duplicate elements present in the array.
//This can be done through two loops.
//The first loop will select an element and the second loop will iteration through the array by comparing the selected element with other elements.
//If a match is found, print the duplicate element.
//
//Program to print the duplicate elements of an array
//        In the above array, the first duplicate will be found at the index 4 which is the duplicate of the element (2) present at index 1.
//        So, duplicate elements in the above array are 2, 3 and 8.
//
//        arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3}.

public class Task1_refac {
    public static void main(String[] args) {
        duplicateInArrayFinder();
    }

    public static void duplicateInArrayFinder() {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        int amountArr = arr.length;
        System.out.println("Duplicate elements in given array are: ");
        for (int i = 0; i < amountArr; i++) {
            for (int j = i + 1; j < amountArr; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}