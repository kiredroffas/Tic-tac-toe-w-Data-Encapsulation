/* This class provides an abstraction for the grid on which the game is played.
   Separate abstraction improves code reuse. */
public class Grid {
  int newGrid[][];
  int n;

  //Constructor, create an empty n x n grid
  public Grid(int n) {
    this.n = n;
    newGrid = new int[n][n];

    for(int rows = 0; rows < n; rows++) {  //Empty is represented by all 0's
      for(int columns = 0; columns < n; columns++) {
        newGrid[rows][columns] = 0;
      }
    }
  }

  //Return the value at a given cell
  public int getCell(int row, int column) {
    return(newGrid[row][column]);
  }

  //Store the given value in the designated cell
  public void setCell(int row, int col, int val) {
    newGrid[row][col] = val;
  }

  //Return true if the designated cell is not empty
  public Boolean isSet(int row, int col) {
    if(newGrid[row][col] != 0) {
      return(true);
    }
    else {
      return(false);
    }
  }

  //Set all cell values back to 0
  public void clear() {
    for(int rows = 0; rows < n; rows++) {
      for(int columns = 0; columns < n; columns++) {
        newGrid[rows][columns] = 0;
      }
    }
  }
}
