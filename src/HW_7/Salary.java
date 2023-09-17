package HW_7;

public class Salary {
    public String name;
    public int age;
    public String gender;
    public int pay;
    public Salary(String name, int age, String gender, int pay) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.pay = pay;
    }
    static int getSum(Salary[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].pay;
        }
        return sum;
    }
}
