import java.util.Scanner;

public class PlayTTT {

  public static void main(String[] args) {
    TicTacToe newGame = new TicTacToe();

    Scanner sc = new Scanner(System.in);
    String input;
    int token;  //Token is 1 or 2 to be added to the board
    int xcoord, ycoord;

    System.out.println("Welcome to Tic-Tac-Toe, would you like to go first? y/n");
    String yn = sc.nextLine();
    if(yn.charAt(0) == 'y') {
      token = 1;
      System.out.println("User goes first");
    }
    else {
      token = 2;
      System.out.println("Computer goes first");
    }
    newGame.printGrid();

    while(newGame.getStatus() != 1 && newGame.getStatus() != 2 && newGame.getStatus() != 3) {
      if(token == 1) {  //User turn
        System.out.println("Enter the coordinates you'd like to place a token at (separated by comma [0-2] [0-2], i.e. 0,2 = [0, 2]) or type 'pm' to place a mark for you.");
        input = sc.nextLine();
        if(input.charAt(0) == 'p' && input.charAt(1) == 'm') {
          System.out.print("User makes a move");
          newGame.placeMark(1);
        }
        else {
          xcoord = Character.getNumericValue(input.charAt(0));
          ycoord = Character.getNumericValue(input.charAt(2));

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
      else if(token == 2) { //Computer turn
        System.out.print("Computer makes its move");
        newGame.placeMark(2);
        newGame.printGrid();
        token = 1;
      }
    }

    if(newGame.getStatus() == 1) {
      System.out.println("User wins!");
    }
    else if(newGame.getStatus() == 2) {
      System.out.println("Computer wins!");
    }
    else {
      System.out.println("Its a tie!");
    }
  }

}
