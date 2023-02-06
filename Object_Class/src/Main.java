public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.printf("Deck of cards in their order: \n");
        deck.printDeck();
        System.out.printf("\nDeck of cards but shuffled: \n");
        deck.shuffle();
        deck.printDeck();
    }
}