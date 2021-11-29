package Lesson5.HW5;

//4. Count words of each length
//Count the number of words of each length in some text.


public class Task4 {
    public static void main(String[] args) {
        String[] arr = {"qwe", "qwe", "asd", "asd"};
        System.out.println();

        public static void wordCounter(String[] arr){
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] != null) {
                int counter = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].equals(arr[j])) {
                        arr[j] = null;
                        counter++;
                    }
                }
                System.out.println("Слово " + arr[i] + " длиной " + arr[i].length() + " повторяется " + counter + " раз");
            }
        }
    }