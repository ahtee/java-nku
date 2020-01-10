/**
 * @(#)connectFour.java
 *
 *
 * @author Ben Otte
 * @version 1.00 2013/3/19
 */

import java.util.Scanner;
import java.util.Random;

public class ConnectFour {

	static int [] next;
	static int [] [] board;
   	  
   	public static void main(String[] args) {
    	char [][] board = new char [6][7]; 
    	initBoard(board);
    	printBoard(board);
    	int result = playGame();
    }
    
      public static void initBoard (char [] [] bd ){
    	for (int r = 0; r < 6; r++)
    		for (int c = 0; c < 7; c++)
    			bd[r][c] = ' ';
    	for ( int x = 0; x < next.length; x++)
    		next[x] = 0;
    }
    
       public static void printBoard( char [] [] bd) {
    	  System.out.println("\n\n");
    	  for (int row =0; row < 6; row++) {
    		  System.out.println(" " + bd[row][0] + " | " + bd[row][1] + " | " + bd[row][2] + " | " + bd[row][3] + " | " + bd[row][4] + " | " + bd[row][5] + " | " + bd[row][6]);
    		  if ( row < 5)
    			  System.out.println("---------------------------");
    	}
    }
    
		static void playerMove(Scanner input) {	
			int move;
			do {
				System.out.println("Choose a column number 1-7 to place your move");
				move = (int)input.nextInt(move);
			} while (move <= 0 || move > 7 || next[move] == 6);
			
			board[ next[move]] [move] = 'X';
    	next[move]++;
		}
    
	 	public static void playGame() {
    		Scanner input = new Scanner(System.in);
    		Random generator = new Random();
    		playerMove(input );
    		computerMove(generator);
    	//	checkhorizontalwin(); // no method: getHorizontalWin, doesnt work at the moment
		
    }
    	static void computerMove(int compmove) {
    		do {
    			Random generator = new Random();
    			compmove = input.nextInt(generator);	
    	} while (compmove > 7 || compmove < 1 || next[compmove] == 6);
    
  	}
}
