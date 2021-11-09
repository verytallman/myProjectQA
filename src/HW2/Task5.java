package HW2;
//5.Написать программу, которая бы решала уравнение вида a * x + b = 0
// Переменные a и b можно задать вручную. Далее нужно будет посчитать и вывести значение “х”.
// Программа должна также учитывать варианты, когда или а = 0 или b = 0


import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("This is equation solver!");
        System.out.println("Equation looks like a*x+b=c");
        System.out.println("In my case equation is 5 * x + 25 = 50");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Type here value for a:");
        int a = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Type here value for b:");
        int b = scanner2.nextInt();
        int c = 50; //ответ после знака "="
        if (a > 0 && b >0){
            int x = (c - b) / a;
            System.out.println("Икс равен: "+x);
        }else if (a == 0 || b == 0){
            System.out.println("Одна из цифр равна нулю.");
        }

    }
}
