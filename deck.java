//Deck class for midterm

//Import libraries
import java.util.ArrayList;
//For shuffling
import java.util.Collections;

// Declare program class
public class deck{
  //Instance variables
  private ArrayList<Card> deck;

  //Constructor
  public deck(){
    //Create deck array list
    deck = new ArrayList<Card>(54);
    //Assign 4 suits to cards
    //by creating an array of strings
    //for each suit
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

    //Create a loop to assign values
    for(int i = 2; i < 15; i++){
      for(var suit : suits) {
        Card card = new Card(i, suit);
        //Add cards to deck
        deck.add(card);
      }
    }
    //We also need to create our 2 joker cards w/ a value of 15
    Card card = new Card(15, "Joker");
    deck.add(card);
    deck.add(card);
  }

  //Methods
  //Check the contents of the deck
  public String toString(){
    String sb = "";
    for(var card : deck) {
      sb += card.getValue() + " " + card.getSuit() + "\n";
    }
    return sb;
  }

  //Shuffle the Deck
  public void shuffle(){
    Collections.shuffle(deck);
  }

  //size
  public int size(){
    return deck.size();
  }

  //Draw a card from the deck
  public Card dealCard(){
    if(deck.size() != 0){
      return deck.remove(0);//Remove the top card that was drawn
    }
    return null;
  }
}
