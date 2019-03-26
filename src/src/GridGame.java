public abstract class GridGame {
  Grid grid;

  //Return information about whether the game has been one, and by whom
  public abstract int getStatus();

  //The indicated player is placing their mark at the designated location
  public abstract Boolean placeMark(int row, int col, int player);

  //The game should make a move for the specified player
  public abstract void placeMark(int player);

  //Print the grid to the screen in a game-appropriate way
  public abstract void printGrid();

  //Perform actions necessary to restart the game, e.g. clearing the grid
  public abstract void restart();
}
