## Pokerito (it's almost Poker!)

Built for loops section.

#### Working

Pokerito is like Poker, but the rules are a lot simpler.

- The dealer will give one random card to you and the computer
- Then, the dealer will draw five cards (the river)
- The player with the most river matches wins
- If the matches are equal, everyone's a winner!

#### Tasks

1. Task 1

   - Create the function: randomCard.
   - There are 13 cards that go from Ace (1) to King (13). Use switch to return a card that matches the random number.
   - Call the function and print the return value.
   - Keep running your function. If it gives you a random card each time, then you're good to go!

2. Task 2

   - Start the game by explaining the rules.
   - It's like Poker, but a lot simpler.

     - There are two players, you and the computer.

     - The dealer will give each player one card.

     - Then, the dealer will draw five cards (the river)

     - The player with the most river matches wins!

     - If the matches are equal, everyone's a winner!

     - Ready? Type anything if you are.

3. Once the user "is ready", present them with a card. Also, show them the computer's card.

   ```sh
   Here is your card:
   <show card>
   <new line>
   Here is the computer\'s card:
   <show computer\'s card>
   ```

4. Print: `Now, the dealer will draw five cards. Press enter to continue.`

   - Use a for loop to draw a card every time the user presses enter. You must draw a total of 5 cards and print the order of each one.

5. Task 5
   - Count how many times your card matches with the river.
   - Count how many times the computer's card matches with the river.
   - Then:
     - print: `Your number of matches: <yourMatches>`
     - print: `Computer number of matches: <computerMatches>`
   - If you have more matches, print: You win!. If the computer has more matches, print: The computer wins!. If the matches are equal, print: everyone wins!
