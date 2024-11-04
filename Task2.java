import java.util.Scanner;
public class Task2 {
    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int) (100 * Math.random());

        int k = 5;
        int i, guess;

        System.out.println("A number is select " + " between 1 to  100 " + " Guess the number " + " within 5 trials");

        for (i = 0; i < k; ++i) {
            System.out.print("Guess the number :");
            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("congratulation! You guessed the right number");
                break;
            } else if (number > guess && i != k - 1) {
                System.out.println("The number is Greater then " + guess + " Try Again!");
            } else if (number < guess && i != k - 1) {
                System.out.println("The number is Less then " + guess + " Try Again!");
            }
        }
        if (i == k) {
            System.out.println("You have Maximum number of try!");
            System.out.println("The number Was " + number);
        }
    }

    public static void main(String[] arg) {
        guessingNumberGame();
    }
}
