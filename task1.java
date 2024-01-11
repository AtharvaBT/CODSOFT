import java.util.*;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 1500;
        int score = 0;

        System.out.println("Welcome to the Number Game !");

        boolean playAgain = true;
        while (playAgain) {
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("I have generated a number between " + minRange + " and " + maxRange + ". Guess it!");

            while (attempts < attemptsLimit) {
                System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    guessed = true;
                    break;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }
            }

            if (!guessed) {
                System.out.println("Sorry, you've used all your attempts. The number was: " + generatedNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();
            if (!playChoice.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing! Your total score is: " + score);
    }

}
