class Main {
  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(deck.showDeck());
    Card card = new Card(38);
    System.out.println(card.Face() + " of " + card.Suit());
  }
}