package com.bridgelabz.objectorientedprograms;
/******************************************************************************
 *  Compilation:  javac -d bin DeckOfCards.java
 *  Execution:    java -cp bin com.bridgelabz.objectorientedprograms.DeckOfCards
 *  
 *  Purpose: Write a Program DeckOfCards.java, to initialize deck of cards having suit (
 *           "Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). 
 *            Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and 
 *            Print the Cards the received by the 4 Players using 2D Array…

 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   16-01-2019
 *
 ******************************************************************************/
public class DeckOfCards {

	
	public static void main(String[] args) 
	{
		String[] SUITS = {
	            "Clubs", "Diamonds", "Hearts", "Spades"
	        };

	        String[] RANKS = {
	            "2", "3", "4", "5", "6", "7", "8", "9", "10",
	            "Jack", "Queen", "King", "Ace"
	        };

	        // initialize deck
	        int n = SUITS.length * RANKS.length;
	        String[] deck = new String[n];
	        for (int i = 0; i < RANKS.length; i++) {
	            for (int j = 0; j < SUITS.length; j++) {
	                deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
	            }
	        }

	        // shuffle
	        for (int i = 0; i < n; i++) {
	            int r = i + (int) (Math.random() * (n-i));
	            String temp = deck[r];
	            deck[r] = deck[i]; 
	            deck[i] = temp;
	            
	        }
	     // print shuffled deck
	        for (int i = 0; i < 4; i++) {
	            System.out.println("** Person " + (i + 1) + " **");
	            for (int j = 0; j < 5; j++) {
	                System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");
	                
	            }
	        }
	    }

}
