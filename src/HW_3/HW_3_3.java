package HW_3;

/*
Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным
на ваш выбор и вывести следующие строки:
maybe a and b are even - если сумма переменных четная
some variable is odd - если сумма переменных нечетная
 */
public class HW_3_3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
    }
}