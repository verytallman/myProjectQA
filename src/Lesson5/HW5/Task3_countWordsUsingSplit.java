package Lesson5.HW5;

//3. Count the words in some text


public class Task3_countWordsUsingSplit {
    public static void main(String[] args) {
        System.out.println(countWordsUsingSplit("Some text right here, awesome"));
    }

    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");
        return words.length;
    }

}
