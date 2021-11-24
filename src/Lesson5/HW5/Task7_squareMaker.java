package Lesson5.HW5;

//7. Square word patterns
//Given a word, print a square made from letter rotations of the word as in:
//help
//elph
//lphe
//phel

public class Task7_squareMaker {
    public static void main(String[] args) {
        System.out.println(squareMaker("Alexey"));
    }

    public static String squareMaker (String string) {
        int wordLength = string.length();
        StringBuffer string2 = new StringBuffer(string);
        string2.append(string);
        for (int i = 0; i < wordLength; i++) {
            for (int j = 0; j != wordLength; j++)
                System.out.print(string2.charAt(i + j));
            System.out.println();
        }return "";
    }
}
