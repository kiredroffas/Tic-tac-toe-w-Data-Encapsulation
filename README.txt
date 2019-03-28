Erik Safford
OOP - Tictactoe in Java
CS 355 - Spring 2019
                                                            
To run 3x3 Tic-Tac-Toe use the following classes in Java Source Code->3x3 Tictactoe:  Grid
                                                                                      GridGame
																				(main)Play3x3TTT
																					  TicTacToe
																					  
To run 4x4 Tic-Tac-Toe use the following classes in Java Source Code->4x4 Tictactoe:  Grid
                                                                                      GridGame
																				(main)Play4x4TTT
																					  TicTacToe

Rules for 3x3 Tic-Tac-Toe: Its just normal tic-tac-toe.

Rules for 4x4 Tic-Tac-Toe: Game is played by two players (user vs computer) on a 4x4 grid.
						   Players alternate placing marks, as with normal Tic-Tac-Toe.
	                       The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game. 
	                       If all spaces are marked with no winner,the game is a tie.
						 
placeMark() algorithm: I chose to implement randomly generated coordinates using a variable of type Random in conjunction with nextInt() for the placeMark() method.
                       Although the moves are random, it manages to win if you let it more often then you'd think.

In both Tic-tac-toe games the user is promted whether to go first or second by either typing and entering 'y' for first or 'n' for second.
Gameplay then begins, with a board appearing with coordinates on the outside to help guide user input. When it is the users turn, they can 
enter a coordinate (seperated by a comma or space) of the spot on the grid they wish to place a mark (X). For 3x3 this is coordinates [0-2],[0-2] and for 4x4 coordinates [0-3],[0-3].
If a user tries to enter a coordinate outside the specified range of the grid, an error message will print, and the user will be asked to enter a valid coordinate.
Any other user input besides two numbers within the specified range (seperated by single comma or space) or 'pm' will potentially crash the programs.

I.e.  '2,0' would place a mark at row 2, column 0 [2,0].

If the user doesn't wish to enter a coordinate, they can have a mark placed for them at a random spot by typing 'pm' (placeMark). When it is the computers turn
a mark (O) will be placed at random at a spot in the grid. The user and computer alternate turns until either one manages to get 3 marks in a horizontal, vertical,
or diagonal line, or until all spots in the grid are marked. The winner/tie is then announced, and the user is promted to play again. If you wish to play again 
type 'yes', otherwise any other input will exit the program.