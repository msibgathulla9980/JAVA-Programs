package com.bridgelabz.objectorientedprograms;
/******************************************************************************
 *  Compilation:  javac -d bin DeckOfCards.java
 *  Execution:    java -cp bin com.bridgelabz.objectorientedprograms.DeckOfCards
 *  
 *  Purpose: Program to create a Player Object having Deck of Cards, 
 *         and having ability to Sort by Rank and maintain the cards in a Queue implemented using Linked List.
 *          Do not use any Collection Library. Further the Player are also arranged in Queue. Finally Print the Player and the Cards received by each Player.

 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   17-01-2019
 *
 ******************************************************************************/
import com.bridgelabz.utility.OopsUtility;
import com.bridgelabz.utility.QueueLinkedList;

public class DeckQueueLinkedList {

        public static void main(String[] args) {
            String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
            String[] Ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
            int n = Suits.length * Ranks.length;
            String[] deck = new String[n];
            for (int i = 0; i < Ranks.length; i++) {
                for (int j = 0; j < Suits.length; j++) {
                    deck[Suits.length * i + j] = Ranks[i] + " Of " +  Suits[j]+",";
                }
            }
            for (int i = 0; i < n; i++) {
                int r = i + (int) (Math.random() * (n - i));
                String temp = deck[r];
                deck[r] = deck[i];
                deck[i] = temp;
            }
            QueueLinkedList<QueueLinkedList<String>> mainQueue = new QueueLinkedList<QueueLinkedList<String>>();
            QueueLinkedList<String> queueLinkedList = new QueueLinkedList<String>();
            System.out.println("Total number of deck of cards are " + deck.length);
            //Storing the cards into the queue
            for (int i = 0; i < 4; i++) {
                String[] demo = new String[9];
                for (int j = 0; j < 9; j++) {
                    demo[j] = deck[i + j * 4];
                }
                String[] str2 = OopsUtility.sortArray(demo);
                for (int k = 0; k < str2.length; k++) {
                    queueLinkedList.enqueue(str2[k]);
                }
                mainQueue.enqueue(queueLinkedList);
                queueLinkedList = new QueueLinkedList<String>();
                continue;
            }
            //Since ASCII value of space comes after 0, hence the value 10 at first.
      //displaying the cards using queue linked list
            for (int i = 0; i < mainQueue.getSize(); i++) {
                QueueLinkedList<String> queue2 = mainQueue.dequeue();
                System.out.println();
                System.out.println("\t\t---------------------------------------- Person " + (i + 1)
                        + " -------------------------------------------");
                System.out.println();
                for (int j = 0; j < queue2.getSize(); j++) {
                    System.out.print(queue2.dequeue() + " ");
                }
                System.out.println();
            }
        }
   

    }




	
	


	

