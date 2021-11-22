package Lesson5;

public class Replace {
    public static void main(String[] args) {
        String s1 = " He4ll8o 5wor2ld1!!!";
        String s2 = s1.replaceAll("[0-9]", "");
//        System.out.println(s2);

//        String str = "Hello Alex!";
//        String str2 = str.replace('l', 'L');
//        System.out.println(str2);


//        if (s2.contains("world")) {
//            System.out.println("ok");
//        }

        String[] sm = s2.split("w");
        System.out.println();
    }
}
