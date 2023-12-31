/*
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.
 */
package HW_6_1;

public class HW_6_1_1 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum = 0; // Инициализируем переменную для хранения суммы

        // Проходим по строкам
        for (int i = 0; i < array.length; i++) {
            // Проходим по элементам в каждой строке
            for (int j = 0; j < array[i].length; j++) {
                // Добавляем значение элемента к общей сумме
                sum += array[i][j];
            }
        }

        System.out.println("Сумма элементов массива: " + sum);
    }
}
