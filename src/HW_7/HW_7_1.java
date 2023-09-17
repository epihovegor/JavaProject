package HW_7;
/*
Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
 */
public class HW_7_1 {
    public static void main(String[] args) {
        Person person = new Person("Jon", 30, "мужской");
        System.out.println(person.getName());
    }

}
