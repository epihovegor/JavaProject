package HW_5;
/*
Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.
 */
public class HW_5_3 {
//    public static void main(String[] args) {
//        String s = "Посмотрите как Рите нравится ритм";
//        String targetSubstring = "рит";
//
//        // Приведение строки и подстроки к нижнему регистру для независимого сравнения
//        s = s.toLowerCase();
//        targetSubstring = targetSubstring.toLowerCase();
//
//        int startIndex = s.indexOf(targetSubstring);
//        while (startIndex != -1) {
//            System.out.println("Найдено совпадение на индексе: " + startIndex);
//            startIndex = s.indexOf(targetSubstring, startIndex + 1);
//        }
//    }
public static void main(String[] args) {
    String s = "Посмотрите как Рите нравится ритм";
    for (int i = 0; i < s.length() - 3; i++) {
        if (s.substring(i, i + 3).equalsIgnoreCase("рит")) {
            System.out.println(i);
        }
        }
    }
}
