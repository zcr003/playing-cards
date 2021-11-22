package edu.cnm.deepdive;

import edu.cnm.deepdive.model.Card;
import edu.cnm.deepdive.model.Rank;
import edu.cnm.deepdive.model.Suit;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

  /*Declaring a variable and its type is List of Cards named deck. Array list is a class that
  implements the List interface */
  public static void main(String[] args) {
    List<Card> deck = new ArrayList<>();
    //Every enum has a static method that gives you all enumerated values in an array.
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        Card c = new Card(r, s);
        deck.add(c);
      }
    }

    System.out.println(deck);
    Collections.shuffle(deck, new SecureRandom());
    System.out.println(deck);
    Collections.sort(deck);
    System.out.println(deck);
    int numRanks = Rank.values().length;
    deck.sort((Card card1, Card card2) -> (card1.getRank().ordinal() + numRanks - 1) % numRanks
        - ((card2.getRank().ordinal() + numRanks - 1) % numRanks));

    System.out.println(deck);

  }

}
