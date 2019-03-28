import java.util.Random;

public class TicTacToe extends GridGame {
  Grid g;

  public TicTacToe() {   //Constructor
    g = new Grid(4);  //Make 4 x 4 grid for tic-tac-toe
  }

  //Check if game is in progress (0), user has won (1), comp has won (2), or game is a tie (3)
  public int getStatus() {
    // 0  1  2  3    //24 win conditions   //0 1 2     //0 4 8    //4 9 14
    // 4  5  6  7                          //1 2 3     //4 8 12   //0 5 10
    // 8  9  10 11                         //4 5 6     //1 5 9    //5 10 15
    // 12 13 14 15                         //5 6 7     //5 9 13   //1 6 11
                                           //8 9 10    //2 6 10   //2 5 8
                                           //9 10 11   //6 10 14  //3 6 9
                                           //12 13 14  //3 7 11   //6 9 12
                                           //13 14 15  //7 11 15  //7 10 13
    int winStatus;

    //0 1 2 player 1
    if(g.getCell(0,0) == 1 && g.getCell(0,1) == 1 && g.getCell(0,2) == 1) {
      winStatus = 1;
    }
    //1 2 3 player 1
    else if(g.getCell(0,1) == 1 && g.getCell(0,2) == 1 && g.getCell(0,3) == 1) {
      winStatus = 1;
    }
    //4 5 6 player 1
    else if(g.getCell(1,0) == 1 && g.getCell(1,1) == 1 && g.getCell(1,2) == 1) {
      winStatus = 1;
    }
    //5 6 7 player 1
    else if(g.getCell(1,1) == 1 && g.getCell(1,2) == 1 && g.getCell(1,3) == 1) {
      winStatus = 1;
    }
    //8 9 10 player 1
    else if(g.getCell(2,0) == 1 && g.getCell(2,1) == 1 && g.getCell(2,2) == 1) {
      winStatus = 1;
    }
    //9 10 11 player 1
    else if(g.getCell(2,1) == 1 && g.getCell(2,2) == 1 && g.getCell(2,3) == 1) {
      winStatus = 1;
    }
    //12 13 14 player 1
    else if(g.getCell(3,0) == 1 && g.getCell(3,1) == 1 && g.getCell(3,2) == 1) {
      winStatus = 1;
    }
    //13 14 15 player 1
    else if(g.getCell(3,1) == 1 && g.getCell(3,2) == 1 && g.getCell(3,3) == 1) {
      winStatus = 1;
    }
    //0 4 8 player 1
    else if(g.getCell(0,0) == 1 && g.getCell(1,0) == 1 && g.getCell(2,0) == 1) {
      winStatus = 1;
    }
    //4 8 12 player 1
    else if(g.getCell(1,0) == 1 && g.getCell(2,0) == 1 && g.getCell(3,0) == 1) {
      winStatus = 1;
    }
    //1 5 9 player 1
    else if(g.getCell(0,1) == 1 && g.getCell(1,1) == 1 && g.getCell(2,1) == 1) {
      winStatus = 1;
    }
    //5 9 13 player 1
    else if(g.getCell(1,1) == 1 && g.getCell(2,1) == 1 && g.getCell(3,1) == 1) {
      winStatus = 1;
    }
    //2 6 10 player 1
    else if(g.getCell(0,2) == 1 && g.getCell(1,2) == 1 && g.getCell(2,2) == 1) {
      winStatus = 1;
    }
    //6 10 14 player 1
    else if(g.getCell(1,2) == 1 && g.getCell(2,2) == 1 && g.getCell(3,2) == 1) {
      winStatus = 1;
    }
    //3 7 11 player 1
    else if(g.getCell(0,3) == 1 && g.getCell(1,3) == 1 && g.getCell(2,3) == 1) {
      winStatus = 1;
    }
    //7 11 15 player 1
    else if(g.getCell(1,3) == 1 && g.getCell(2,3) == 1 && g.getCell(3,3) == 1) {
      winStatus = 1;
    }
    //4 9 14 player 1
    else if(g.getCell(1,0) == 1 && g.getCell(2,1) == 1 && g.getCell(3,2) == 1) {
      winStatus = 1;
    }
    //0 5 10 player 1
    else if(g.getCell(0,0) == 1 && g.getCell(1,1) == 1 && g.getCell(2,2) == 1) {
      winStatus = 1;
    }
    //5 10 15 player 1
    else if(g.getCell(1,1) == 1 && g.getCell(2,2) == 1 && g.getCell(3,3) == 1) {
      winStatus = 1;
    }
    //1 6 11 player 1
    else if(g.getCell(0,1) == 1 && g.getCell(1,2) == 1 && g.getCell(2,3) == 1) {
      winStatus = 1;
    }
    //2 5 8 player 1
    else if(g.getCell(0,2) == 1 && g.getCell(1,1) == 1 && g.getCell(2,0) == 1) {
      winStatus = 1;
    }
    //3 6 9 player 1
    else if(g.getCell(0,3) == 1 && g.getCell(1,2) == 1 && g.getCell(2,1) == 1) {
      winStatus = 1;
    }
    //6 9 12 player 1
    else if(g.getCell(1,2) == 1 && g.getCell(2,1) == 1 && g.getCell(3,0) == 1) {
      winStatus = 1;
    }
    //7 10 13 player 1
    else if(g.getCell(1,3) == 1 && g.getCell(2,2) == 1 && g.getCell(3,1) == 1) {
      winStatus = 1;
    }
    //0 1 2 player 2
    else if(g.getCell(0,0) == 2 && g.getCell(0,1) == 2 && g.getCell(0,2) == 2) {
      winStatus = 2;
    }
    //1 2 3 player 2
    else if(g.getCell(0,1) == 2 && g.getCell(0,2) == 2 && g.getCell(0,3) == 2) {
      winStatus = 2;
    }
    //4 5 6 player 2
    else if(g.getCell(1,0) == 2 && g.getCell(1,1) == 2 && g.getCell(1,2) == 2) {
      winStatus = 2;
    }
    //5 6 7 player 2
    else if(g.getCell(1,1) == 2 && g.getCell(1,2) == 2 && g.getCell(1,3) == 2) {
      winStatus = 2;
    }
    //8 9 10 player 2
    else if(g.getCell(2,0) == 2 && g.getCell(2,1) == 2 && g.getCell(2,2) == 2) {
      winStatus = 2;
    }
    //9 10 11 player 2
    else if(g.getCell(2,1) == 2 && g.getCell(2,2) == 2 && g.getCell(2,3) == 2) {
      winStatus = 2;
    }
    //12 13 14 player 2
    else if(g.getCell(3,0) == 2 && g.getCell(3,1) == 2 && g.getCell(3,2) == 2) {
      winStatus = 2;
    }
    //13 14 15 player 2
    else if(g.getCell(3,1) == 2 && g.getCell(3,2) == 2 && g.getCell(3,3) == 2) {
      winStatus = 2;
    }
    //0 4 8 player 2
    else if(g.getCell(0,0) == 2 && g.getCell(1,0) == 2 && g.getCell(2,0) == 2) {
      winStatus = 2;
    }
    //4 8 12 player 2
    else if(g.getCell(1,0) == 2 && g.getCell(2,0) == 2 && g.getCell(3,0) == 2) {
      winStatus = 2;
    }
    //1 5 9 player 2
    else if(g.getCell(0,1) == 2 && g.getCell(1,1) == 2 && g.getCell(2,1) == 2) {
      winStatus = 2;
    }
    //5 9 13 player 2
    else if(g.getCell(1,1) == 2 && g.getCell(2,1) == 2 && g.getCell(3,1) == 2) {
      winStatus = 2;
    }
    //2 6 10 player 2
    else if(g.getCell(0,2) == 2 && g.getCell(1,2) == 2 && g.getCell(2,2) == 2) {
      winStatus = 2;
    }
    //6 10 14 player 2
    else if(g.getCell(1,2) == 2 && g.getCell(2,2) == 2 && g.getCell(3,2) == 2) {
      winStatus = 2;
    }
    //3 7 11 player 2
    else if(g.getCell(0,3) == 2 && g.getCell(1,3) == 2 && g.getCell(2,3) == 2) {
      winStatus = 2;
    }
    //7 11 15 player 2
    else if(g.getCell(1,3) == 2 && g.getCell(2,3) == 2 && g.getCell(3,3) == 2) {
      winStatus = 2;
    }
    //4 9 14 player 2
    else if(g.getCell(1,0) == 2 && g.getCell(2,1) == 2 && g.getCell(3,2) == 2) {
      winStatus = 2;
    }
    //0 5 10 player 2
    else if(g.getCell(0,0) == 2 && g.getCell(1,1) == 2 && g.getCell(2,2) == 2) {
      winStatus = 2;
    }
    //5 10 15 player 2
    else if(g.getCell(1,1) == 2 && g.getCell(2,2) == 2 && g.getCell(3,3) == 2) {
      winStatus = 2;
    }
    //1 6 11 player 2
    else if(g.getCell(0,1) == 2 && g.getCell(1,2) == 2 && g.getCell(2,3) == 2) {
      winStatus = 2;
    }
    //2 5 8 player 2
    else if(g.getCell(0,2) == 2 && g.getCell(1,1) == 2 && g.getCell(2,0) == 2) {
      winStatus = 2;
    }
    //3 6 9 player 2
    else if(g.getCell(0,3) == 2 && g.getCell(1,2) == 2 && g.getCell(2,1) == 2) {
      winStatus = 2;
    }
    //6 9 12 player 2
    else if(g.getCell(1,2) == 2 && g.getCell(2,1) == 2 && g.getCell(3,0) == 2) {
      winStatus = 2;
    }
    //7 10 13 player 2
    else if(g.getCell(1,3) == 2 && g.getCell(2,2) == 2 && g.getCell(3,1) == 2) {
      winStatus = 2;
    }
    //Tie
    else if(g.isSet(0, 0) == true && g.isSet(0, 1) == true && g.isSet(0, 2) == true && g.isSet(0,3) == true &&
            g.isSet(1, 0) == true && g.isSet(1, 1) == true && g.isSet(1, 2) == true && g.isSet(1,3) == true &&
            g.isSet(2, 0) == true && g.isSet(2, 1) == true && g.isSet(2, 2) == true && g.isSet(2,3) == true &&
            g.isSet(3, 0) == true && g.isSet(3, 1) == true && g.isSet(3, 2) == true && g.isSet(3,3) == true) {
      winStatus = 3;
    }
    //Game in progress
    else {
      winStatus = 0;
    }
    return(winStatus);
  }

  //Attempt to place a mark at a specified spot in the grid
  public Boolean placeMark(int row, int col, int player) {
    int cellVal;
    if(player == 1) {
      if(row > 3 || row < 0 || col > 3 || col < 0) {  //If entered coords are out of range of board
        return(false);
      }
      cellVal = g.getCell(row, col);
      if(cellVal != 0) {  //If the space is already taken
        System.out.println("Space is already taken!");
        return(false);
      }
      else {  //Else we can enter the value into the grid
        g.setCell(row, col, 1);
        System.out.println("Set coordinate [" + row + ", " + col + "] as X");
        return (true);
      }
    }
    else if(player == 2) {
      if(row > 3 || row < 0 || col > 3 || col < 0) {  //If entered coords are out of range
        return(false);
      }
      cellVal = g.getCell(row, col);
      if(cellVal != 0) {
        System.out.println("Space is already taken!");
        return(false);
      }
      else {
        g.setCell(row, col, 2);
        System.out.println("Set coordinate [" + row + ", " + col + "] as O");
        return (true);
      }
    }
    else {
      System.out.println("Invalid player");
      return(false);
    }
  }

  //Place a mark for the specified player, computer or user can utilize
  public void placeMark(int player) {
    while(true) {
      Random rand = new Random();
      int x = rand.nextInt(4);  //Get a value between 0-2 for x-coord
      int y = rand.nextInt(4);  //Get a value between 0-2 for y-coord

      if (g.getCell(x, y) == 0) {   //Check if spot is empty
        g.setCell(x, y, player);  //Mark the spot
        char c;
        if(player == 1) {
          c = 'X';
        }
        else {
          c = 'O';
        }
        System.out.println(", placing " + c + " at [" + x + ", " + y + "]");
        return;
      }
    }
  }

  //Print the tic-tac-toe board
  public void printGrid() {
    int spot0 = g.getCell(0,0);
    int spot1 = g.getCell(0,1);
    int spot2 = g.getCell(0,2);
    int spot3 = g.getCell(0,3);
    int spot4 = g.getCell(1,0);
    int spot5 = g.getCell(1,1);
    int spot6 = g.getCell(1,2);
    int spot7 = g.getCell(1,3);
    int spot8 = g.getCell(2,0);
    int spot9 = g.getCell(2,1);
    int spot10 = g.getCell(2,2);
    int spot11 = g.getCell(2,3);
    int spot12 = g.getCell(3,0);
    int spot13 = g.getCell(3,1);
    int spot14 = g.getCell(3,2);
    int spot15 = g.getCell(3,3);


    System.out.println("   0   1   2   3");
    System.out.print("0  ");
    if(spot0 == 0) {
      System.out.print(" ");
    }
    else if(spot0 == 1){
      System.out.print("X");
    }
    else {
      System.out.print("O");
    }

    System.out.print(" | ");

    if(spot1 == 0) {
      System.out.print(" ");
    }
    else if(spot1 == 1){
      System.out.print("X");
    }
    else {
      System.out.print("O");
    }

    System.out.print(" | ");

    if(spot2 == 0) {
      System.out.print(" ");
    }
    else if(spot2 == 1){
      System.out.print("X");
    }
    else {
      System.out.print("O");
    }

    System.out.print(" | ");

    if(spot3 == 0) {
      System.out.println(" ");
    }
    else if(spot3 == 1){
      System.out.println("X");
    }
    else {
      System.out.println("O");
    }

    System.out.println("   --+---+---+--");
    System.out.print("1  ");

    if(spot4 == 0) {
      System.out.print(" ");
    }
    else if(spot4 == 1){
      System.out.print("X");
    }
    else {
      System.out.print("O");
    }

    System.out.print(" | ");

    if(spot5 == 0) {
      System.out.print(" ");
    }
    else if(spot5 == 1){
      System.out.print("X");
    }
    else {
      System.out.print("O");
    }

    System.out.print(" | ");

    if(spot6 == 0) {
      System.out.print(" ");
    }
    else if(spot6 == 1){
      System.out.print("X");
    }
    else {
      System.out.print("O");
    }

    System.out.print(" | ");

    if(spot7 == 0) {
      System.out.println(" ");
    }
    else if(spot7 == 1){
      System.out.println("X");
    }
    else {
      System.out.println("O");
    }

    System.out.println("   --+---+---+--");
    System.out.print("2  ");

    if(spot8 == 0) {
      System.out.print(" ");
    }
    else if(spot8 == 1){
      System.out.print("X");
    }
    else {
      System.out.print("O");
    }

    System.out.print(" | ");

    if(spot9 == 0) {
      System.out.print(" ");
    }
    else if(spot9 == 1){
      System.out.print("X");
    }
    else {
      System.out.print("O");
    }

    System.out.print(" | ");

    if(spot10 == 0) {
      System.out.print(" ");
    }
    else if(spot10 == 1){
      System.out.print("X");
    }
    else {
      System.out.print("O");
    }

    System.out.print(" | ");

    if(spot11 == 0) {
      System.out.println(" ");
    }
    else if(spot11 == 1){
      System.out.println("X");
    }
    else {
      System.out.println("O");
    }

    System.out.println("   --+---+---+--");
    System.out.print("3  ");

    if(spot12 == 0) {
      System.out.print(" ");
    }
    else if(spot12 == 1){
      System.out.print("X");
    }
    else {
      System.out.print("O");
    }

    System.out.print(" | ");

    if(spot13 == 0) {
      System.out.print(" ");
    }
    else if(spot13 == 1){
      System.out.print("X");
    }
    else {
      System.out.print("O");
    }

    System.out.print(" | ");

    if(spot14 == 0) {
      System.out.print(" ");
    }
    else if(spot14 == 1){
      System.out.print("X");
    }
    else {
      System.out.print("O");
    }

    System.out.print(" | ");

    if(spot15 == 0) {
      System.out.println(" ");
    }
    else if(spot15 == 1){
      System.out.println("X");
    }
    else {
      System.out.println("O");
    }
  }

  //Clear the board to start a new game
  public void restart() {
    g.clear();
  }
}
