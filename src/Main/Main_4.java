package Main;

public class Main_4 {
    public static void main(String[] args) {
        // Переменная boolean может принимать только 2 значения, true или false
        boolean itMoves = true; // Двигается?
        boolean shouldItMove = false; // Должно двигаться?

        if (itMoves == shouldItMove) {
            System.out.println("No problem");
        } else if (itMoves) {
            System.out.println("Use duct tape");
        } else {
            System.out.println("Use WD-40");
        }
//
//        if (itMoves) { // Двигается
//            if (shouldItMove) { // Должно двигаться
//                System.out.println("No problem");
//            } else {
//                System.out.println("Use duct tape");
//            }
//        } else {
//            if (shouldItMove) { // Не двигается
//                System.out.println("Use WD-40");
//            } else { // Не должно двигаться
//                System.out.println("No problem");
//            }
//        }
    }
}
