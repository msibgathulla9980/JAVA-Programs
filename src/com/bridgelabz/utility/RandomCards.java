package com.bridgelabz.utility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.bridgelabz.objectorientedprograms.*;
public class RandomCards {

	@SuppressWarnings("unused")
	private Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

	public RandomCards() {
	}

	public static void main(String[] args) {
		ArrayList<Card> player1 = new ArrayList<Card>();
		ArrayList<Card> player2 = new ArrayList<Card>();
		ArrayList<Card> player3 = new ArrayList<Card>();
		ArrayList<Card> player4 = new ArrayList<Card>();

		ArrayList<Card> deck = Card.newDeck();
		int j = 1;
		for (int i = 0; i < 52; i++) {
			if (j == 1) {
				player1.add(deck.get(i));
				j++;
				continue;
			} else if (j == 2) {
				player2.add(deck.get(i));
				j++;
				continue;
			} else if (j == 3) {
				player3.add(deck.get(i));

				j++;
				continue;
			} else if (j == 4) {
				player4.add(deck.get(i));
				j = 1;
				continue;
			}
		}
		System.out.println(" Player 1 " + player1);
		System.out.println(" Player 2 " + player2);
		System.out.println(" Player 3 " + player3);
		System.out.println(" Player 4 " + player4);
	}
}

