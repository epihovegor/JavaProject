package HW_2;

public class HW_2_1 {
    public static void main(String[] args) {
        int a = 1000;
        int b = 33;

        System.out.print("a + b = ");
        System.out.println(a + b);
        System.out.print("a * b = ");
        System.out.println(a * b);
        System.out.print("a - b = ");
        System.out.println(a - b);
        System.out.print("Целая часть деления a на b равна ");
        System.out.println(a / b);
        System.out.print("Остаток от деления a на b равен ");
        System.out.println(a % b);
        //Нормальное деление
        System.out.print("a / b = ");
        System.out.println(a * 1.0 / b); // На 1.0 можно умножить любое из чисел a или b

        System.out.print("a - четное число?: ");
        System.out.println(a % 2 == 0);
        System.out.print("b - четное число?: ");
        System.out.println(b % 2 == 0);
    }
}
