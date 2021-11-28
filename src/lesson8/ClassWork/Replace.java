package lesson8.ClassWork;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        }

    public void symbolReplacement (){
        System.out.println("This is Replace program");
        System.out.println("All chars"+" a "+"will be transformed into "+"@.");
        System.out.println("All chars"+" o "+"will be transformed into "+"0.");
        System.out.println("Please, enter a string for Replace process.");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String outputString1 = inputString.replaceAll("a", "@");
        String outputString2 = outputString1.replaceAll("o", "0");
        if (inputString.length() > 30){
            System.out.println("Max symbol length is 30");
        }else{
            System.out.println(outputString2);
    }
        System.out.println("bye");
}
}

