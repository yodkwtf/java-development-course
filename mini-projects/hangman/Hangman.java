import java.util.Scanner;
import java.util.Arrays;

public class Hangman {
    public static Scanner scan = new Scanner(System.in);

    // bunch of random words
    public static String[] words = {
            "ant", "baboon", "badger", "bat", "bear", "beaver", "camel", "cat", "clam", "cobra",
            "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose",
            "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt", "otter", "owl",
            "panda",
            "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal", "shark", "sheep",
            "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout", "turkey", "turtle",
            "weasel",
            "whale", "wolf", "wombat", "zebra"
    };

    // The hanged man
    public static String[] gallows = {
            "+---+\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" + // if the user didn't miss any guesses.
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" + // if the user missed one guess.
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" + // if the user missed two guesses.
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" + // if the user missed three guesses.
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if the user missed four guesses.
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if the user missed five guesses.
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if the user missed six guesses.
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n" };

    public static void main(String[] args) {
        String randomWord = randomWord();
        char[] randomWordLetters = randomWord.toCharArray();

        int wrongGuessesCount = 0;
        char[] guessedWord = new char[randomWordLetters.length];
        char[] wrongGuesses = new char[26 - randomWordLetters.length];

        // Initiate guessed word as blank
        for (int i = 0; i < randomWordLetters.length; i++) {
            guessedWord[i] = '_';
        }

        // As long as user doesn't win
        while (!Arrays.equals(randomWordLetters, guessedWord)) {
            // Print Gallows
            printGallows(wrongGuessesCount);

            // Check if user ran out of guesses
            if (wrongGuessesCount >= 6) {
                System.out.println("RIP");
                System.out.println("\nYou ran out of guesses!");
                System.out.println("\nThe correct word was \"" + randomWord + "\"");
                System.exit(0);
            }

            // Print word/placeholder
            printPlaceholders(guessedWord);

            // Print misses
            printMissedGuesses(wrongGuesses);

            // Ask for Guess
            System.out.print("Guess: ");
            String guess = scan.next();
            System.out.print("\n");

            // Check guess
            if (checkGuess(randomWord, guess)) {
                updatePlaceholders(randomWordLetters, guessedWord, guess);
            } else {
                wrongGuessesCount++;
                wrongGuesses[wrongGuessesCount] = guess.charAt(0);
            }
        }

        printGallows(wrongGuessesCount);
        System.out.println("\nWord: " + randomWord);
        System.out.println("\nGOOD WORK!");

    }

    // FUNCTION: printGallows()
    public static void printGallows(int index) {
        System.out.println("***************************************\n");
        System.out.println(gallows[index]);
    }

    // FUNCTION: printPlaceholders()
    public static void printPlaceholders(char[] guessedWord) {
        System.out.print("Word: ");
        for (int i = 0; i < guessedWord.length; i++) {
            System.out.print(guessedWord[i] + " ");
        }
        System.out.print("\n\n");
    }

    // FUNCTION: printMissedGuesses()
    public static void printMissedGuesses(char[] wrongGuesses) {
        System.out.print("Misses: ");
        for (int i = 0; i < wrongGuesses.length; i++) {
            System.out.print(wrongGuesses[i]);
        }
        System.out.println("\n");
    }

    // FUNCTION: checkGuess()
    public static boolean checkGuess(String correctWord, String guess) {
        if (correctWord.contains(guess)) {
            return true;
        }
        return false;
    }

    // FUNCTION: updatePlaceholders()
    public static void updatePlaceholders(char[] correctWord, char[] guessedWord, String guess) {
        for (int i = 0; i < correctWord.length; i++) {
            if (correctWord[i] == guess.charAt(0)) {
                guessedWord[i] = guess.charAt(0);
            }
        }
    }

    // FUNCTION: randomWord()
    public static String randomWord() {
        // 1. Generate a random number between 0 and the length of the words array
        int random = (int) (Math.random() * words.length);

        // 2. Return the word at the index of the random number
        return words[random];
    }
}
