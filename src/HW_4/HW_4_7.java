package HW_4;

/*
Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.
 */
public class HW_4_7 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i = i + 1) {
            sum = sum + array[i]; //Складываем все цифры в массиве
        }
        System.out.println(sum * 1.0 / array.length); //Выводим среднюю оценку
    }
}
