package lesson1.homework.training;

public class Employee {

    private String name;

    public Employee (String name) {

        if (name == null) {
            System.out.println("Invalid input. Employee not created.");
            return;
        }

        setName(name);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }
}