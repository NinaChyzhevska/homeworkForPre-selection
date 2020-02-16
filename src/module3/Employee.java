package module3;

import java.util.Random;

public class Employee {
    private String name;
    private String surname;
    private int id;

    public Employee(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public Employee() {
        this.id = Math.abs(new Random().nextInt());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printEmployee() {
        System.out.println("The employee is: " + name + " " + surname + " " + id);
    }
}
