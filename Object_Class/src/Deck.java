import java.util.Random;

class Deck {
    private Card[] deck;
    private int currentCard;
    private static final Random randomNumbers = new Random();

    public Deck() {
        deck = new Card[52];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++)
            deck[count] = new Card(count % 13, count / 13);
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