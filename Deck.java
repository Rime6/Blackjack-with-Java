
/**
 *  Deck represents a deck of playing cards and contains 52 regular cards.
 */
public class Deck {

    private Card[] deck;  // an array of 52 cards.  
    private int number;  //the number of cards that have been dealt from the deck

    /**
     * Constructs a regular 52-card poker deck.  Initially, the cards
     * are in a sorted order.  
     */
    public Deck() {
        //VOTRE CODE VIENT ICI
        deck = new Card[52];
        int index = 0;
        for (int color=0; color<4; color++) {
            for (int value=1;value<=13;value++) {
                Card c1 = new Card(value,color);
                deck[index]= c1;
                index++;
            }
        }
        number = 0;
    }


    /**
     * Put all the used cards back into the deck (if any), and
     * shuffle the deck into a random order.
     */
    public void shuffle() {
        //VOTRE CODE VIENT ICI
        number = 0; // Remet toutes les cartes dans le paquet
        for (int i = deck.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1)); // Génère un index aléatoire
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    /**
     * Returns the number of cards left in the deck.  
     */
    public int numberLeft() {
        //VOTRE CODE VIENT ICI
        return 52-number;
    }

    /**
     * Removes the next card from the deck and return it.  It is illegal
     * to call this method if there are no more cards in the deck.  You can
     * check the number of cards remaining by calling the numberLeft() function.
     * @return the card which is removed from the deck.
     * @throws IllegalStateException if there are no cards left in the deck
     */
    public Card take() {
        //VOTRE CODE VIENT ICI
        if (number >= deck.length) { 
            throw new IllegalStateException("No more cards left");
        }
        Card save = deck[number];
        deck[number] = null; 
        number++; 
        return save;
    }
} // end class Deck
