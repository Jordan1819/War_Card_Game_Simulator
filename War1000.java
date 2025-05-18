// Program to run the war game 1000 times and calculate summary/ stats
// Jordan Waite

//Declare Program class
public class War1000{
  public static void main(String[] args){
    //Instance variables
    int totalRounds = 0;
    int totalWars = 0;
    int totalPlayer1Wins = 0;
    int totalPlayer2Wins = 0;

    //Here we will play 1000 games of war
    for(int i =0; i < 1000; i++){
      //Call our war constructor
      War warGame = new War();

      //Get stats for each game
      totalRounds += warGame.getRoundCount();
      totalWars += warGame.getWarCount();
      totalPlayer1Wins += warGame.getPlayer1Wins();
      totalPlayer2Wins += warGame.getPlayer2Wins();
    }

    //Get the averages
    long averageRounds = (long) totalRounds / 1000;
    long averageWars = totalWars / 1000;

    //Output
    System.out.println("Average number of rounds per game: " + averageRounds);
    System.out.println("Average number of wars per game: " + averageWars);
    System.out.println("Player 1 win count: " + totalPlayer1Wins);
    System.out.println("Player 2 win count: " + totalPlayer2Wins);
  }
}
