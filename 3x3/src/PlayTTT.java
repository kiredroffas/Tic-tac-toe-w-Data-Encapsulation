import java.util.Scanner;

public class PlayTTT {

  public static void main(String[] args) {
    TicTacToe newGame = new TicTacToe();  //Make a new tic-tac-toe game

    Scanner sc = new Scanner(System.in);
    String input;
    int token;  //Token is 1 or 2 to be added to the board
    int xcoord, ycoord;
    int cont = 0;  //Continue, flag to check if user wants to play again

    while(cont == 0) {
      //Find out if user wants to go first
      System.out.println("Welcome to Tic-Tac-Toe, would you like to go first? y/n");
      String yn = sc.nextLine();
      if (yn.charAt(0) == 'y') {
        token = 1;
        System.out.println("User goes first");
      } else {
        token = 2;
        System.out.println("Computer goes first");
      }
      newGame.printGrid();

      //While someone hasn't won or its not a tie
      while (newGame.getStatus() != 1 && newGame.getStatus() != 2 && newGame.getStatus() != 3) {
        if (token == 1) {  //User turn
          System.out.println("Enter the coordinates you'd like to place a token at (separated by comma [0-2] [0-2], i.e. 0,2 = [0, 2]) or type 'pm' to place a mark for you.");
          input = sc.nextLine();  //Read in user's coordinate
          if (input.charAt(0) == 'p' && input.charAt(1) == 'm') {  //If user wants to have a move made for them
            System.out.print("User makes a move");
            newGame.placeMark(1);
          }
          else {  //Else get the coordinates they want to place the mark at
            xcoord = Character.getNumericValue(input.charAt(0));
            ycoord = Character.getNumericValue(input.charAt(2));

            //If its not a valid place to pass the mark at, get new coordinates
            while (newGame.placeMark(xcoord, ycoord, 1) == false) {
              System.out.println("Invalid marker coordinates! Enter new coordinates (separated by comma [0-2] [0-2], i.e. 0,2 = [0, 2]):");
              newGame.printGrid();
              input = sc.nextLine();
              xcoord = Character.getNumericValue(input.charAt(0));
              ycoord = Character.getNumericValue(input.charAt(2));
            }
          }
          newGame.printGrid();
          token = 2;
        }
        else if (token == 2) { //Computer turn
          System.out.print("Computer makes its move");
          newGame.placeMark(2);
          newGame.printGrid();
          token = 1;
        }
      }

      //Check for win conditions
      if (newGame.getStatus() == 1) {
        System.out.println("User wins!");
      }
      else if (newGame.getStatus() == 2) {
        System.out.println("Computer wins!");
      }
      else {
        System.out.println("Its a tie!");
      }

      //Ask to play again
      System.out.println("Would you like to play again? Type 'yes' to play again, or anything else to exit.");
      yn = sc.nextLine();
      if(yn.charAt(0) == 'y' && yn.charAt(1) == 'e' && yn.charAt(2) == 's') {
        cont = 0;
        newGame.restart();
        System.out.println("Another round!");
      }
      else {
        cont = 1;
        System.out.println("Goodbye!");
      }
    }
  }

}
