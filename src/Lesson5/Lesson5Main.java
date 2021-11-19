package Lesson5;

public class Lesson5Main {
    public static void main(String[] args) {
//        String s1 = "welcome";
//        String s2 = "welcome";
//        s2 = "welcome!"; // s2 не равно s1
//        String s3 = "welcome"; // с каждым одинаковым значением в памяти занимается только 1 слот
//        System.out.println();
//
//        String str = "My String";
//        String str1 = new String("welcome"); //str1 не равняется s1, потому что разный метод передачи
//        System.out.println(s1.equals(str1));
//        String str1 = "Hello";
//        String str2 = " world ";
//        int int1 = 5;
//        int int2 = 7;
//        System.out.println(int1 + str1 + int2);
//        System.out.println(Integer.parseInt("124165")+ 6);
//        System.out.println(str1.concat(str2));
//
//        String s3 = "Hello";
//        char[] ch1 = s3.toCharArray();
//        for (int i = 0; i < ch1.length; i++){
//            System.out.println(ch1[i]);

        String a1 = "Hello world";
        a1.substring(2);
        String a2 = a1.substring(6);
        String a3 = a1.substring(6, a1.length() - 1);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);


        String s3 = "Hello %s !!!";

        System.out.println(setFormat(s3, "Alex"));

        String s4 = String.format(s3, "Alex");
        String s5 = String.format(s3, "Ivan");
        System.out.println(s4);
        System.out.println(s5);

        }

        public static String setFormat (String generalString, String stringToInsert){
        return String.format(generalString,stringToInsert);

        }




    }


