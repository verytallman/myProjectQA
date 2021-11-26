package Lesson5.HW5;

//6. Product code validation eg: AX6BYU56UX6CV6BNT7NM 287430
//1st part can contain only capital letters and 6 digits. 2nd part is all digits and = the product of the
//first 6 digits taken in groups of two from the left. Eg 65*66*67 = 287430.


import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(digitSeparator("AX6BYU56UX6CV6BNT7NM 287430"));
    }

    public static StringBuilder digitSeparator(String input) {
        char[] charArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char i : charArray) {
            if (Character.isDigit(i)) {
                sb.append(i);
            }
        } return sb;
    }
}