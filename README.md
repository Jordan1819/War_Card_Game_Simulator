
# 🎴 **War Card Game Simulator** 🎮

This project is a **Java-based simulation** of the classic card game "War." It was developed to practice **object-oriented programming** principles like **polymorphism**, **inheritance**, and **class instances** in Java.

---

## ✨ **Features**

- **🧩 Object-Oriented Design:** The project uses multiple classes like `Card`, `Deck`, `Player`, and `War` to organize different components and logic of the game.
- **⚔️ Game Simulation:** The `War` class simulates a single game of War between two players, handling the rules, card comparisons, and tie (war) scenarios.
- **📊 Statistical Analysis:** The `War1000` class runs the War game **1000 times**, collecting statistics such as the **average number of rounds**, **average number of wars**, and **win counts** for each player. It demonstrates the **probability** and **randomness** involved in the game.
- **💻 Practice with Java Collections:** Uses **Java collections** such as `ArrayList` and `ArrayDeque` to manage the **deck** and **player hands**.

---

## 🎯 **Purpose**

The goal of this project is to:

- **Reinforce understanding** of Java's **object-oriented features**.
- Gain experience in **class design**, **encapsulation**, and working with **collections**.
- Run the game multiple times to analyze **probability principles** and observe the behavior of **randomized simulations** in action.

---

## 🚀 **How to Run**

### 1. **Compile all `.java` files:**
```bash
javac *.java
```

### 2. **Play a single game of War:**
```bash
java War
```

### 3. **Run 1000 simulations and view statistical results:**
```bash
java War1000
```

---

## 📂 **Files**

- [`Card.java`](Card.java): Represents a playing card.
- [`Deck.java`](Deck.java): Manages the deck of cards.
- [`Player.java`](Player.java): Represents a player and their hand.
- [`War.java`](War.java): Contains the logic for playing a single game.
- [`War1000.java`](War1000.java): Runs the game **1000 times** and outputs statistics.

---

## 📈 **How It Works**

1. The **`War` class** sets up the game, comparing cards between two players.
2. If both cards are equal, a "war" happens, and the game continues.
3. **The `War1000` class** runs the game repeatedly, gathering data to analyze performance and random outcomes.
4. The project demonstrates core **Java** principles, including **collections** and **randomness**, while providing insight into **statistical outcomes**.

---

🎉 **Enjoy the game and explore how randomness works in simulations!** 🃏

This project is a practical application of object-oriented programming in **Java** and a great way to visualize and analyze a simple card game.
