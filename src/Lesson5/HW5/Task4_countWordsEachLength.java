package Lesson5.HW5;

//4. Count words of each length
//Count the number of words of each length in some text.


public class Task4_countWordsEachLength {
    public static void main(String[] args) {
        String [] arr = {"qwe", "qwe","qwertyui","qwertyui","Alexey","Alexey"};
        System.out.println(wordLengthCounter(arr));
    }

    public static String wordLengthCounter(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] != null) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].equals(arr[j])) {
                        arr[j] = null;
                        count++;
                    }
                }
                System.out.println("The word " + arr[i] + " with length " + arr[i].length() + " repeated for " + count + " times.");
            }
        return "";
    }
 }