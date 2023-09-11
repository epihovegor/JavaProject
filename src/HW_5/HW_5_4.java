package HW_5;
/*
Дан массив:
String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
 */
public class HW_5_4 {
    public static void main(String[] args) {
//        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
//        int count = 0;
//        for (String[] subArray : array) {
//            boolean containsE = false;
//            for (String s : subArray) {
//                if (s.contains("е")) {
//                    containsE = true;
//                    break;
//                }
//            }
//            if (!containsE) {
//                count++;
//            }
//        }
//        System.out.println("Количество строк без буквы \"е\": " + count);
         String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
         int count = 0;
         for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array[i].length; j++) {
                 if (!array[i][j].contains("е")) {
                     count++;
                 }
             }
        }
        System.out.println(count);
    }
}
