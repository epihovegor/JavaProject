package HW_7;
/*
Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника у которого был вызван
метод и сотрудника который был передан как параметр, одинаковое имя.
 */
public class HW_7_2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 30, "мужской");
        Employee employee2 = new Employee("John", 25, "женский");
        System.out.println(employee1.isSameName(employee2));
    }
}
