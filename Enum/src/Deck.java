import java.util.Random;

public class Deck {
    private final Card[] deck;
    private int currentCard;
    private static final Random randomNumbers = new Random();

    public Deck() {
        deck = new Card[52];
        currentCard = 0;

        int i = 0;
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                deck[i] = new Card(rank, suit);
                i++;
            }
        }
    }

    public void shuffle() {
        currentCard = 0;

        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(52);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public void printDeck() {
        int maxLength = 0;
        for (int i = 0; i < 52; i++) {
            System.out.printf("%-18s | ", deck[i].toString());
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    }
}
