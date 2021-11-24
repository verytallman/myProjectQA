package Lesson5.HW5;

//7. Square word patterns
//Given a word, print a square made from letter rotations of the word as in:
//help
//elph
//lphe
//phel

public class Task7 {
    public static void main(String[] args) {
        String str = new String("Старлей");
        squareMaker(str);
    }

    public static void squareMaker (String str) {
        int wordLength = str.length();
        StringBuffer str2 = new StringBuffer(str);
        str2.append(str);
        for (int i = 0; i < wordLength; i++) {
            for (int j = 0; j != wordLength; j++)
                System.out.print(str2.charAt(i + j));
            System.out.println();
        }
    }
}
