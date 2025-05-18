//War class for midproject

//Jordan Waite

//Import libraries
import java.util.ArrayList;
import java.util.Random;

//Define program class
public class War{
  //Instance variables
  private Player Player_1;
  private Player Player_2;
  private int roundCount;
  private int warCount;
  private int player1Wins;
  private int player2Wins;

  //Constructor
  public War(){
    //Initialize the game
    initialize();
    play();
  }

  //Getter methods for 1000 games
  public int getRoundCount(){
    return roundCount;
  }
  public int getWarCount(){
    return warCount;
  }
  public int getPlayer1Wins(){
    return player1Wins;
  }
  public int getPlayer2Wins(){
    return player2Wins;
  }

  protected void initialize(){
    //First thing we need is a deck of cards
    //Create deck
    deck myDeck = new deck();//Give us the 54 cards

    //Shuffle deck so games are different
    myDeck.shuffle();

    //Create player decks
    Player_1 = new Player();
    Player_2 = new Player();

    //Populate decks with cards
    for(int i=0; i <27; i++){
      Player_1.addCard(myDeck.dealCard());
      Player_2.addCard(myDeck.dealCard());
    }

    //Initialize the round counter
    roundCount = 0;
  }

  //Our play method will begin playing the game
  public void play(){
    //Ensure that we are only playing while both players have more than zero cards
    while(Player_1.size() > 0 && Player_2.size() > 0) {
      battle();
      roundCount++;
    }

    //Use ternary operation to get the winner
    String winner = (Player_1.size() > Player_2.size()) ? "Player 1" : "Player 2";

    //Update win counts for each player
    if(Player_1.size() == 0){
      player2Wins++;
    }
    else{
      player1Wins++;
    }

    //End of the game
    System.out.println("******************************************");
    System.out.println(winner + " IS VICTORIOUS AFTER " + roundCount + " ROUNDS!\n");
  }

  //Method to draw, compare, and add cards to the winners deck
  public void battle(){
    //Pull the top card of each players deck
    Card playerOneCard = Player_1.deal();
    Card playerTwoCard = Player_2.deal();

    //Print the cards that each player played
    System.out.println("Player 1 played " + playerOneCard.getValue() + " of " + playerOneCard.getSuit() + "\n");
    System.out.println("Player 2 played " + playerTwoCard.getValue() + " of " + playerTwoCard.getSuit() + "\n");

    //Generate a random number between 0 and 1
    Random random = new Random();
    int randNum = random.nextInt(2);

    //Compare the two cards played
    //If player one wins, they get both cards
    if (playerOneCard.getValue() > playerTwoCard.getValue()){
      System.out.println("Player 1 wins! \n");

      //Add the cards to Player 1's deck in random order
      if (randNum == 0){
        Player_1.addCard(playerOneCard);
        Player_1.addCard(playerTwoCard);
      }
      else {
        Player_1.addCard(playerTwoCard);
        Player_1.addCard(playerOneCard);
      }

      //Print the size of each player's deck
      System.out.println("Player 1 has " + Player_1.size() + " cards in their deck.");
      System.out.println("Player 2 has " + Player_2.size() + " cards in their deck.\n");
    }

    //If player two wins, they get both cards
    else if (playerOneCard.getValue() < playerTwoCard.getValue()){
      System.out.println("Player 2 wins! \n");

      //Add both cards to player 2's deck in random order
      if(randNum == 0){
        Player_2.addCard(playerOneCard);
        Player_2.addCard(playerTwoCard);
      }
      else {
        Player_2.addCard(playerTwoCard);
        Player_2.addCard(playerOneCard);
      }

      //Print the size of each player's deck
      System.out.println("Player 1 has " + Player_1.size() + " cards in their deck.");
      System.out.println("Player 2 has " + Player_2.size() + " cards in their deck.\n");
    }

    //If we get a tie, we will notify the players and call the tie function
    else {
      System.out.println("Their forces are matched! Both players call in reinforcements!\n");
      //Call the tie function and pass the current cards as parameters
      tie(playerOneCard, playerTwoCard);
    }
  }

  //Tie (war) method for when players play the same card during a battle
  public void tie(Card playerOneCard, Card playerTwoCard){
    //Create a new arraylist that will store all the cards played this round
    ArrayList<Card> cardsPlayed = new ArrayList<>();
    //Counter for 1000 games 
    warCount++;

    // Check if either player played their last card
    // If a tie happens, and one player has no cards left to play
    // the player with remaining cards automatically wins
    if (Player_1.size() == 0) {
        System.out.println("Player 1 has no reinforcements left. Player 2 wins!\n");
        return;
    }
    else if (Player_2.size() == 0) {
        System.out.println("Player 2 has no reinforcements left. Player 1 wins!\n");
        return;
    }

    //Add the cards from the initial battle to the cardsPlayed list
    cardsPlayed.add(playerOneCard);
    cardsPlayed.add(playerTwoCard);

    //Keep going until someone wins the tie
    while (true){

      if (Player_1.size() == 0) {
          System.out.println("Player 1 has no reinforcements left. Player 2 wins!\n");
          return;
      }
      else if (Player_2.size() == 0) {
          System.out.println("Player 2 has no reinforcements left. Player 1 wins!\n");
          return;
      }
      //Draw the next cards for each player
      Card nextPlayerOneCard = Player_1.deal();
      Card nextPlayerTwoCard = Player_2.deal();

      //Print the cards drawn
      System.out.println("Player 1 played " + nextPlayerOneCard.getValue() + " of " + nextPlayerOneCard.getSuit() + "\n");
      System.out.println("Player 2 played " + nextPlayerTwoCard.getValue() + " of " + nextPlayerTwoCard.getSuit() + "\n");

      //Add the current cards to the cardsPlayed list
      cardsPlayed.add(nextPlayerOneCard);
      cardsPlayed.add(nextPlayerTwoCard);

      //Compare the current cards
      //If player 1 wins
      if (nextPlayerOneCard.getValue() > nextPlayerTwoCard.getValue()){
        System.out.println("Player 1 wins the war!\n");
        //Add each card in the cardsPlayed list to player 1's deck
        for(Card card : cardsPlayed){
          Player_1.addCard(card);
        }
        //Print the size of each player's deck
        System.out.println("Player 1 has " + Player_1.size() + " cards in their deck.");
        System.out.println("Player 2 has " + Player_2.size() + " cards in their deck.\n");
        break; //Exit tie loop
      }
      //If player 2 wins
      else if(nextPlayerOneCard.getValue() < nextPlayerTwoCard.getValue()){
        System.out.println("Player 2 wins the war!\n");
        //Add each card in the pile to player 2's deck
        for(Card card : cardsPlayed){
          Player_2.addCard(card);
        }
        //Print the size of each players deck
        System.out.println("Player 1 has " + Player_1.size() + " cards in their deck.");
        System.out.println("Player 2 has " + Player_2.size() + " cards in their deck.\n");
        break; //Exit loop
      }
      //If the players get another tie, go back to beginning of while loop
      else {
        System.out.println("Another tie! Call in more reinforcements!\n");
      }
    }
  }

  //Define program main
  public static void main(String[] args){
    //Start it all in the main
    War warGame = new War();
  }
}
