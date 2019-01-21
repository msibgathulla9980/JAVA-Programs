/******************************************************************************
 *  Compilation:  javac -d bin TicTacToe.java
 *  Execution:    java -cp bin com.bridgelabz.utility.TicTacToe
 *  
 *  Purpose: Determines Program to play a Cross Game or Tic-Tac-Toe Game. Player 1 is the Computer and the Player 2 is the user. Player 1 take Random Cell that is the Column and Row. 

 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;


import com.bridgelabz.utility.*;

public class TicTacToe {

	public static void main(String[] args) {
		int t=0;
	
		do{
		FunctionalUtility.play();

	}while(t<6);


}
}