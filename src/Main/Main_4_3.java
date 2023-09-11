package Main;

public class Main_4_3 {
    public static void main(String[] args) {
        // Перебирает выражение пока число не будет равно myNumbers
        int min = 0;
        int max = 100;
        int myNomber = 15;

        int guess;
        do {
            guess = (min + max) / 2;
            System.out.print("?");
            System.out.println(guess);

            if (guess < myNomber) {
                min = guess;
            } else {
                max = guess;
            }
        } while (guess !=myNomber);
    }
}
