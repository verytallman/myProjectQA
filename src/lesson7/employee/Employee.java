package lesson7.employee;

public class Employee {
    private String name;
    private int age;
    private int salary = 100;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public String toString() {
        return "Employee name: " + name + " and his age is: " + age + "with salary:" + salary;
    }

    public boolean equals(Object o) {

        return o.equals(name) ? true : false;
    }



}
