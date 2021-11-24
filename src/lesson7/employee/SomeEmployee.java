package lesson7.employee;

public class SomeEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Mike", 30);

        Employee employee1 = new Employee("Kate", 25, 120);
        System.out.println(employee1.toString());

        employee.equals(employee1);


    }
}
