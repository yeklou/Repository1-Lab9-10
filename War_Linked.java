/**
 * Simulation of card game war.
 * In the simulation, we use array-based queues and array-based stacks.
 * 
 * @author ITSC 2214
 *
 * @version 1.0
 */

import java.util.Scanner;

/** The card game War for two players. */
public class War_Linked {

  /** For reading from the Console. */
  public static final Scanner INPUT = new Scanner(System.in);
  
  /** Player 1's pile of Cards. */
  private QueueADT<Card> hand1;

  /** Player 2's pile of Cards. */
  private QueueADT<Card> hand2;

  /** Deal all the Cards out to the players. */
  public War_Linked() {
    hand1 = new LinkedQueue<Card>();
    hand2 = new LinkedQueue<Card>();
    Deck deck = new Deck();
    deck.shuffle();
    while (!(deck.isEmpty())) {
      hand1.enqueue(deck.deal());
      hand2.enqueue(deck.deal());
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
            //TODO pop off a card on top of stack1 and insert it to winner's pile in hand. For example,
                //winner.
            }
        while (!(stack2.isEmpty())) {
            //TODO pop off a card on top of stack2 and insert it to winner's pile in hand. For example,
                //winner.
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
        //TODO initialize stack1 and stack2. For example,
        //StackADT<Card> stack1 = 
        //StackADT<Card> stack2 = 
        
        //TODO deal a card from the pile of each player to stack1 and stack2 respectively. For example,
        //stack1.
        //stack2.
        
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
    War_Linked game = new War_Linked();
    game.play();
  }
  
}
