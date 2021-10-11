package edu.cnm.deepdive.model;

public enum Suit {
  CLUBS('\u2663', Color.BLACK),
  DIAMONDS('\u2662', Color.RED),
  HEARTS('\u2661', Color.RED),
  SPADES('\u2660', Color.BLACK);

  private final char symbol;
  private final Color color;

  //The constructor, which assigns the parameter symbol/color.
  Suit(char symbol, Color color) {
    this.symbol = symbol;
    this.color = color;
  }

  //To grant access to a private field use a getter!
  public char getSymbol() {
    return symbol;
  }

  public Color getColor() {
    return color;
  }

  public enum Color {
    BLACK, RED
  }

}

