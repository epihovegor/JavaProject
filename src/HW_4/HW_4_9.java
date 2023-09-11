package HW_4;
/*
Дан массив произвольных целых чисел.
проверить, отсортирован ли он, т.е. все ли числа в массиве стоят так, что каждое следующее число больше предыдущего.
 */
public class HW_4_9 {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 1, 4};
        boolean sorted = true;

        for (int i = 0; i < array.length - 1; i++) { //-1 для того, чтобы не сравнивали 4 с последующим числом т.к. его нет
            if (array[i] > array[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Массив отсортирован");
        } else {
            System.out.println("Массив не отсортирован");
        }
    }
}
