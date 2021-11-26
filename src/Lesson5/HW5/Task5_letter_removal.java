package Lesson5.HW5;

//5. Letter removal
//Given a phrase and a letter (or series of letters) remove all occurrences of that letter(s) in the
//phrase.

public class Task5_letter_removal {
    public static void main(String[] args) {
        removeChar("I will delete char W from this text", 'w');
    }

        static void removeChar (String s, char c){
            int j;
            int counter = 0;
            int n = s.length();
            char[] t = s.toCharArray();
            for (int i = j = 0; i < n; i++) {
                if (t[i] != c)
                    t[j++] = t[i];
                else
                    counter++;
            }
            while (counter > 0) {
                t[j++] = '\0';
                counter--;
            }
            System.out.println(t);
        }
}
