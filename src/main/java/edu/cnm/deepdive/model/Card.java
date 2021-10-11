package edu.cnm.deepdive.model;

public class Card {

  private final Rank rank;
  private final Suit suit;


  //The constructor has the job of initializing an instance.
  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;

  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

  @Override
  public String toString() {
    return String.format("%s %s", rank.getSymbol(), suit.getSymbol());
  }

}
