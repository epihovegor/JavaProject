package Main;

import java.util.Arrays;

public class Main_4_1 {
    public static void main(String[] args) {
        int[] scoreMarks = new int[] {5, 5, 5, 5, 4, 3, 3, 2, 1, 3}; //Массив
//        System.out.println(scoreMarks[4]); //Просим вывести 4 символ из массива(нумерация с 0)
        //Меняем 7 и 8 символ в массиве на 4
//        scoreMarks[7] = 4;
//        scoreMarks[8] = 4;
//        System.out.println(Arrays.toString(scoreMarks)); //Arrays.toString - печатает массивы

        // Все цифры которые < 4 мы увеличиваем на 1
//        for (int i = 0; i < scoreMarks.length; i = i + 1) { //length - возвращает длину строки
//            int score = scoreMarks[i];
//            if (score < 4) {
//                scoreMarks[i] = score + 1;
//            }
//        }
//        System.out.println(Arrays.toString(scoreMarks));

//        int sum = 0;
//        for (int i = 0; i < scoreMarks.length; i = i + 1) { //scoreMarks.length - длина массива
//            sum = sum + scoreMarks[i]; //Складываем все цифры в массиве
//        }
//        System.out.println(sum * 1.0 / scoreMarks.length); //Выводим среднюю оценку

//        //Выведем минимальное число из массива
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < scoreMarks.length; i = i + 1) { //scoreMarks.length - длина массива
//            int elem = scoreMarks[i]; //Складываем все цифры в массиве
//            if (elem < min) {
//                min = elem;
//            }
//        }
//        System.out.println(min);

        // Вывести каждый элемент в массиве в квадрате
        int[] resoult = new int [scoreMarks.length];
        for (int i = 0; i < scoreMarks.length; i = i + 1) { //scoreMarks.length - длина массива
            int elem = scoreMarks[i];
            resoult[i] = elem * elem;
        }
        System.out.println(Arrays.toString(resoult));
    }
}
