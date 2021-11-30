package lesson9.Task1;

import lesson7.employee.SomeEmployee;

public class App {

    public static void main(String[] args) {
        Reader NewReader = new Reader("Дегтярев А. В.","Н125128ОНSYW","Физико-математический","12.03.1995",
                "+38095942562");



        NewReader.takeBook("SADASD");
        NewReader.takeBook(2);
        NewReader.takeBook(new String[] {"Приключения", "Словарь", "Энциклопедия"});

    }
}
