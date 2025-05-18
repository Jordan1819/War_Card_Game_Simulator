//Card object for midterm
//Declare program class
public class Card{
  //Instance variables
  int value; //2-10, J-11, Q-12, K-13, A-14, joker-15
  String suit;

  //Constructor
  public Card(int value, String suit) {
    this.value = value;
    this.suit = suit;
  }

  //Accessor methods
  public int getValue(){return value;}
  public String getSuit(){return suit;}
}
