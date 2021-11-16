package Lesson3.HW3;

//Write a program that outputs a reversible string (use an array of characters - char string [])

public class Task5 {
    public static void main(String[] args) {
        char[] stringMyName = new char[7];
        stringMyName[0] = 'A';
        stringMyName[1] = 'l';
        stringMyName[2] = 'e';
        stringMyName[3] = 'k';
        stringMyName[4] = 's';
        stringMyName[5] = 'e';
        stringMyName[6] = 'y';
        int amountChars = stringMyName.length;
        String[] reversed = new String[amountChars];
        System.out.print("My name using reversed string: ");
        while (amountChars > 0) {
            System.out.print(stringMyName[amountChars - 1]);
            reversed[7 - amountChars] = String.valueOf(stringMyName[amountChars - 1]);
            amountChars--;
        }
    }
}