package HW_7;

public class Employee {
    public String name;
    public int age;
    public String gender;
    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    // Конструктор класса
    public boolean isSameName(Employee otherEmployee){
        return this.name.equals(otherEmployee.name);
    }
}
