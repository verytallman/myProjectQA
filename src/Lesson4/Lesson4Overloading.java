package Lesson4;

public class Lesson4Overloading {
    public static void main(String[] args) {
        System.out.println(amountOfInstance(5, 6));
        System.out.println(amountOfInstance("5","6"));

    }

    public static int amountOfInstance(int firstInt, int secondInt){
        return firstInt+ secondInt;
    }
    public static int amountOfInstance(String firstString, String secondString){
        return (firstString + secondString).length();
    }

}
