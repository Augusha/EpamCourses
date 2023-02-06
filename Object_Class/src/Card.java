class Card {
    private int rank;
    private int suit;
    public static final String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    public static final String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public String toString() {
        return RANKS[rank] + " of " + SUITS[suit];
    }
}