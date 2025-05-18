//Player deck class for midproject

//Import library
import java.util.ArrayDeque;

//Declare the class
public class Player{
  //Instance variables
  private ArrayDeque<Card> playerDeck = new ArrayDeque<Card>();

  //Create constructor
  public Player(){
    playerDeck = new ArrayDeque<Card>();//Empty
  }

  //Methods

  //Method to add cards
  public void addCard(Card c) {
    playerDeck.addLast(c);
  }

  //To string method to check values
  public String toString(){
    String sb = "";
    for(var card : playerDeck){
      sb += card.getValue() + " " + "of " + card.getSuit() + "\n";
    }
    return sb;
  }

  //Method to get the size of a deck
  public int size(){
    return playerDeck.size();
  }

  //Method to deal cards to players
  public Card deal(){
    return playerDeck.removeFirst();
  }

}
