## Hangman Game

Hangman is a word-guessing game. It keeps asking the user to guess characters until:

1. They guess every character correctly (win).
2. They miss 6 guesses (loss).

#### Instructions

1. Choose a random word from given set of words

```java
public static String[] words = {
  "ant", "baboon", "badger", "bat", "bear","beaver", "camel", "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout", "turkey","turtle", "weasel", "whale", "wolf", "wombat", "zebra"
};
```

2. At every turn, show the following things:

   - Current gallows (Hanged Man's stage)
   - The word to guess (Use `_` for the letters which aren't guessed)
   - The wrong letters guessed (So user doesn't guess them again)

3. On correct guess, replace the placeholder `_` with the correct letter

4. At the end, print "You Won" or "You lost, the correct word was <WORD>" and stop the game

5. Keep these things in mind:

   - Add one \n after printing the word/placeholders
   - Add two \n after printing the misses
   - Add one \n after the guess

6. HINT - Look up how to:

   - Convert a String to an array of characters.
   - Get the index of a character in a String.
   - Loop through characters in a String.
   - check if two arrays are equal to each other.

7. POSSIBLE DESIGN - Your functions can be:
   - randomWord(): returns a random word from the list of random words.
   - checkGuess(): returns true if the user guessed a letter from the word correctly.
   - updatePlaceholders(): updates the placeholders when the user makes a correct guess.
   - printPlaceholders(): prints the placeholders.
   - printMissedGuesses(): prints guesses that the user missed.
