import java.util.Random;

public class TicTacToe extends GridGame {
  Grid g;

  public TicTacToe() {   //Constructor
    g = new Grid(3);
  }

  public int getStatus() {
    // 0 1 2      //012 345 678
    // 3 4 5      //036 147 258
    // 6 7 8      //048 246
    int winStatus;

    //012 player 1
    if(g.getCell(0,0) == 1 && g.getCell(0,1) == 1 && g.getCell(0,2) == 1) {
      winStatus = 1;
    }
    //345 player 1
    else if(g.getCell(1,0) == 1 && g.getCell(1,1) == 1 && g.getCell(1,2) == 1) {
      winStatus = 1;
    }
    //678 player 1
    else if(g.getCell(2,0) == 1 && g.getCell(2,1) == 1 && g.getCell(2,2) == 1) {
      winStatus = 1;
    }
    //036 player 1
    else if(g.getCell(0,0) == 1 && g.getCell(1,0) == 1 && g.getCell(2,0) == 1) {
      winStatus = 1;
    }
    //147 player 1
    else if(g.getCell(0,1) == 1 && g.getCell(1,1) == 1 && g.getCell(2,1) == 1) {
      winStatus = 1;
    }
    //258 player 1
    else if(g.getCell(0,2) == 1 && g.getCell(1,2) == 1 && g.getCell(2,2) == 1) {
      winStatus = 1;
    }
    //048 player 1
    else if(g.getCell(0,0) == 1 && g.getCell(1,1) == 1 && g.getCell(2,2) == 1) {
      winStatus = 1;
    }
    //246 player 1
    else if(g.getCell(0,2) == 1 && g.getCell(1,1) == 1 && g.getCell(2,0) == 1) {
      winStatus = 1;
    }
    //012 player 2
    else if(g.getCell(0,0) == 2 && g.getCell(0,1) == 2 && g.getCell(0,2) == 2) {
      winStatus = 2;
    }
    //345 player 2
    else if(g.getCell(1,0) == 2 && g.getCell(1,1) == 2 && g.getCell(1,2) == 2) {
      winStatus = 2;
    }
    //678 player 2
    else if(g.getCell(2,0) == 2 && g.getCell(2,1) == 2 && g.getCell(2,2) == 2) {
      winStatus = 2;
    }
    //036 player 2
    else if(g.getCell(0,0) == 2 && g.getCell(1,0) == 2 && g.getCell(2,0) == 2) {
      winStatus = 2;
    }
    //147 player 2
    else if(g.getCell(0,1) == 2 && g.getCell(1,1) == 2 && g.getCell(2,1) == 2) {
      winStatus = 2;
    }
    //258 player 2
    else if(g.getCell(0,2) == 2 && g.getCell(1,2) == 2 && g.getCell(2,2) == 2) {
      winStatus = 2;
    }
    //048 player 2
    else if(g.getCell(0,0) == 2 && g.getCell(1,1) == 2 && g.getCell(2,2) == 2) {
      winStatus = 2;
    }
    //246 player 2
    else if(g.getCell(0,2) == 2 && g.getCell(1,1) == 2 && g.getCell(2,0) == 2) {
      winStatus = 2;
    }
    else if(g.getCell(0, 0) != 0 && g.getCell(0, 1) != 0 && g.getCell(0, 2) != 0 &&
        g.getCell(1, 0) != 0 && g.getCell(1, 1) != 0 && g.getCell(1, 2) != 0 &&
        g.getCell(2, 0) != 0 && g.getCell(2, 1) != 0 && g.getCell(2, 2) != 0 ) {
      winStatus = 3;
    }
    else {
      winStatus = 0;
    }
    return(winStatus);
  }

  public Boolean placeMark(int row, int col, int player) {
    int cellVal;
    if(player == 1) {
      if(row > 2 || row < 0 || col > 2 || col < 0) {  //If entered coords are out of range of board
        return(false);
      }
      cellVal = g.getCell(row, col);
      if(cellVal != 0) {
        System.out.println("Space is already taken!");
        return(false);
      }
      else {
        g.setCell(row, col, 1);
        System.out.println("Set coordinate [" + row + ", " + col + "] as " + 1);
        return (true);
      }
    }
    else if(player == 2) {
      if(row > 2 || row < 0 || col > 2 || col < 0) {  //If entered coords are out of range
        return(false);
      }
      cellVal = g.getCell(row, col);
      if(cellVal != 0) {
        System.out.println("Space is already taken!");
        return(false);
      }
      else {
        g.setCell(row, col, 2);
        System.out.println("Set coordinate [" + row + ", " + col + "] as " + 2);
        return (true);
      }
    }
    else {
      System.out.println("Invalid player");
      return(false);
    }
  }

  public void placeMark(int player) {
    while(true) {
      Random rand = new Random();
      int x = rand.nextInt(3);  //Get a value between 0-2 for x-coord
      int y = rand.nextInt(3);  //Get a value between 0-2 for y-coord

      if (g.getCell(x, y) == 0) {   //Check if spot is empty
        g.setCell(x, y, player);  //Mark the spot
        System.out.println(", placing " + player + " at [" + x + ", " + y + "]");
        return;
      }
    }
  }

  public void printGrid() {
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        System.out.print(g.getCell(i,j) + "  ");
      }
      System.out.println();
    }
  }

  public void restart() {
    g.clear();
  }
}
