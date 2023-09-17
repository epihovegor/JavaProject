package HW_7;

public class Person {
    public String name;
    public int age;
    public String gender;
    public String getName() {
        if ("мужской".equals(gender)) {
            return "Mr. " + name;
        } else if ("женский".equals(gender)) {
            return "Mrs. " + name;
        } else {
            return name;
        }
    }
    // Конструктор класса
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
