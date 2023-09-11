package Main;

public class Main_3 {
    public static void main(String[] args) {
        int personAge = 40;
        int age = 50;
        int maxAge = 50;
        int minAge = 10;
//        System.out.println("Вы старше " + age + " лет?");
//        if (personAge > age) {
//            System.out.print("Да");
//        } else {
//            System.out.print("Нет");
//        }
//        if (personAge < age) {
//            System.out.print("Да");
//        } else {
//            System.out.print("Нет");
//        }
//        System.out.println("Вам ровно " + age + " лет?");
//        if (personAge == age) {
//            System.out.print("Да");
//        } else {
//            System.out.print("Нет");
//        }
        // && - and
        // || - or
//        System.out.println("Вам больше " + minAge + " и меньше " + maxAge + " лет?");
//        if (personAge > minAge && personAge < maxAge) {
//            System.out.print("Да");
//        } else {
//            System.out.print("Нет");
//        }
        System.out.println("Вы младше " + minAge + " и старше " + maxAge + " лет?");
        if (personAge < minAge || personAge > maxAge) {
            System.out.print("Да");
        } else {
            System.out.print("Нет");
        }
    }
}
