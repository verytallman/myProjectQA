package Lesson5.HW5;

//6. Product code validation eg: AX6BYU56UX6CV6BNT7NM 287430
//1st part can contain only capital letters and 6 digits. 2nd part is all digits and = the product of the
//first 6 digits taken in groups of two from the left. Eg 65*66*67 = 287430.


public class Task6_ProductCodeValidation {
    public static void main(String[] args) {
        System.out.println(productCodeValidator("AX6BYU56UX6CV6BNT7NM 287430"));
    }
    public static String productCodeValidator (String input) {
        String digits = input.replaceAll("[A-Z]", "");
        char [] parsedIntsInArray = digits.toCharArray();
        String firsInt = Character.toString(parsedIntsInArray[0])+Character.toString(parsedIntsInArray[1]);
        String secondInt = Character.toString(parsedIntsInArray[2])+Character.toString(parsedIntsInArray[3]);
        String thirdInt = Character.toString(parsedIntsInArray[4])+Character.toString(parsedIntsInArray[5]);

        String result = Character.toString(parsedIntsInArray[7])+Character.toString(parsedIntsInArray[8])+
               Character.toString(parsedIntsInArray[9])+Character.toString(parsedIntsInArray[10])+
               Character.toString(parsedIntsInArray[11])+Character.toString(parsedIntsInArray[12]);

        int a = Integer.parseInt(firsInt)*Integer.parseInt(secondInt)*Integer.parseInt(thirdInt);
        int b = Integer.parseInt(result);

        if( a == b ) {
            System.out.println("Correct");
        }else {
            System.out.println("Incorrect");
        }






//        String number = "";
//        int i;
//        for (i = 0; i < input.length(); i++) {
//            char [] arrayOfDigits = number.toCharArray();
//            char a = input.charAt(i);
//            if (Character.isDigit(a)){
//                number = number + a;
//            }
//          //  System.out.println(qwe);
//        } return number;
//   int[] qwe = Integer.parseInt(number);
    return "";
    }
}