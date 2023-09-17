package HW_7;

public class HW_7_3 {
    public static void main(String[] args) {
        Salary employee1 = new Salary("John", 30, "мужской",100);
        Salary employee2 = new Salary("John", 25, "женский",100);
        Salary[] employees = new Salary[] {employee1,employee2};
        System.out.println(Salary.getSum(employees));
    }
}
