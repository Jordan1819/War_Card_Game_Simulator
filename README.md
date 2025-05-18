# War Card Game Simulator

This project is a Java-based simulation of the classic card game "War." It was developed as an exercise to practice working with multiple instances of classes, polymorphism, inheritance, and other object-oriented programming principles in Java.

## Features

- **Object-Oriented Design:** The project is structured using multiple classes, including `Card`, `deck`, `Player`, and `War`, to encapsulate the different components and logic of the game.
- **Game Simulation:** The `War` class simulates a single game of War between two players, handling the rules, card comparisons, and tie (war) scenarios.
- **Statistical Analysis:** The `War1000` class runs the War game 1000 times, collecting statistics such as the average number of rounds, average number of wars, and win counts for each player. This allows for the observation of probability and randomness in action.
- **Practice with Java Collections:** Utilizes Java collections such as `ArrayList` and `ArrayDeque` for managing decks and player hands.

## Purpose

The main goal of this project was to reinforce understanding of Java's object-oriented features and to gain experience with class design, encapsulation, and collection usage. Additionally, by running the game multiple times, the project provides insight into probability principles and the behavior of randomized simulations.

## How to Run

1. Compile all `.java` files:
   ```sh
   javac *.java
   ```
2. To play a single game of War, run:
   ```sh
   java War
   ```
3. To run 1000 simulations and view statistical results, run:
   ```sh
   java War1000
   ```

## Files

- [`Card.java`](Card.java): Represents a playing card.
- [`deck.java`](deck.java): Manages the deck of cards.
- [`Player.java`](Player.java): Represents a player and their hand.
- [`War.java`](War.java): Contains the logic for playing a single game.
- [`War1000.java`](War1000.java): Runs the game 1000 times and outputs statistics.

---
This project demonstrates the use of object-oriented programming in Java and provides a practical example of simulating and analyzing a simple card game.