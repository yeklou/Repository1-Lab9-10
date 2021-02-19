/**
 * Simulation of card game war.
 * In the simulation, we use linked list queues and linked list stacks.
 * 
 * @author ITSC 2214
 *
 * @version 1.0
 */

import java.util.Scanner;

/** The card game War_array for two players. */
public class War_array {

  /** For reading from the Console. */
  public static final Scanner INPUT = new Scanner(System.in);
  
  /** Player 1's pile of Cards. */
  private QueueADT<Card> hand1;

  /** Player 2's pile of Cards. */
  private QueueADT<Card> hand2;

  /** Deal all the Cards out to the players. */
  public War_array() {
      //TODO Initialize two piles in hand. For example,
    //hand1 = 
    //hand2 = 
    
    Deck deck = new Deck();
    deck.shuffle();
    while (!(deck.isEmpty())) {
        //TODO deal a card for each player and add the card to the corresponding pile. For example,
      //hand1.
      //hand2.
    }
  }

  /** Give all of the Cards played to the winning player. */
  public void give(StackADT<Card> stack1,
                   StackADT<Card> stack2,
                   QueueADT<Card> winner) {
    if (winner == hand1) {
      System.out.println("Player 1 gets the cards");
    } else {
      System.out.println("Player 2 gets the cards");
    }
    
    try{
        while (!(stack1.isEmpty())) {
              winner.enqueue(stack1.pop());
            }
        while (!(stack2.isEmpty())) {
              winner.enqueue(stack2.pop());
            }
    } catch (Exception e){
        e.printStackTrace();
    }
  }

  /** Play until one player runs out of Cards. */
  public void play() {
    while (!(hand1.isEmpty() || hand2.isEmpty())) {
      System.out.print("\nHit return to play round: ");
      INPUT.nextLine();
      playRound();
      if (hand1.isEmpty()) {
        System.out.println("Player 2 wins!");
      }
      if (hand2.isEmpty()) {
        System.out.println("Player 1 wins!");
      }
    }
  }

  /** Play one round. */
  public void playRound() {
    try{
        StackADT<Card> stack1 = new ArrayStack<Card>();
        StackADT<Card> stack2 = new ArrayStack<Card>();
        
        stack1.push(hand1.dequeue());
        stack2.push(hand2.dequeue());
        
        do {
          Card card1 = stack1.peek();
          Card card2 = stack2.peek();
          System.out.println(card1 + " " + card2);
          QueueADT<Card> winner = null;
          if (card1.getRank() > card2.getRank()) {
                    winner = hand1;
              }
          if (card1.getRank() < card2.getRank()) {
                    winner = hand2;
          }
          if (winner != null) {
            give(stack1, stack2, winner);
            return;
          }
        } while (!settledByWar(stack1, stack2));
    } catch (Exception e){
        e.printStackTrace();
    }
  }

  /**
   * Play a war over stack1 and stack2.  If this ends the game because
   * one player runs out of cards, give the cards to the winning
   * player and return true.  Otherwise, return false.
   */
  public boolean settledByWar(StackADT<Card> stack1, StackADT<Card> stack2) {
    System.out.println("War!");
    try{
        for (int i = 0; i < 2; i++) {
          if (hand1.isEmpty()) {
            give(stack1, stack2, hand2);
            return true;
          }
          stack1.push(hand1.dequeue());
          if (hand2.isEmpty()) {
            give(stack1, stack2, hand1);
            return true;
          }
          stack2.push(hand2.dequeue());
        }
    } catch (Exception e){
        e.printStackTrace();
    }
    return false;
  }

  /** Create and play the game. */
  public static void main(String[] args) {
    System.out.println("Welcome to War.");
    War_array game = new War_array();
    game.play();
  }
  
}
