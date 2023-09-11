package HW_6_3;

public class HW_6_3_1 {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int vit(int a, int b) {
        return a - b;
    }
    public static int ym(int a, int b) {
        return a * b;
    }
    public static double del(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(vit(10, 20));
        System.out.println(ym(10, 20));
        System.out.println(del(10, 20));
    }
}
