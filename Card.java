/**
 * Card class represents a playing card from a deck.  A card has a color and a value
 */

public class Card {
  
    private final int color;   // Card's color
    private final int value;     //Card's value (1 - 13, with 1 representing ACE).

   /***
     * Codes for the colors and non-numeric cards. Cards 2 through 10 have their numerical values for their codes.
     * */
   
    public final static int CLUBS = 0;   
    public final static int DIAMONDS = 1;
    public final static int HEARTS = 2;
    public final static int SPADES = 3; 
  
    public final static int ACE = 1;     
    public final static int JACK = 11;    
    public final static int QUEEN = 12;   
    public final static int KING = 13;


    /**
     * Constrcutor, that creates a card with a specified color and value.
     * @throws IllegalArgumentException if the parameter values are not in the ranges
     */
    public Card(int value, int color) {
        //VOTRE CODE VIENT ICI
        if (value < ACE || value > KING) {
            throw new IllegalArgumentException("Valeur invalide: doit être entre " + ACE + " et " + KING);
        }
        if (color < CLUBS || color > SPADES) {
            throw new IllegalArgumentException("Couleur invalide: doit être entre " + CLUBS + " et " + SPADES);
        }
        this.value = value;
        this.color = color;
    }

    /**
     * Returns the color of this card.
     */
    public int getColor() {
       // VOTRE CODE VIENT ICI
       return this.color;
    }

    /**
     * Returns the value of this card.
     * @return the value, which is one of the numbers 1 through 13, inclusive for
     * a regular card.
     */
    public int getValue() {
       // VOTRE CODE VIENT ICI
       return this.value;
    }

    /**
     * Returns a String representation of the card's color.
     * @return one of the strings "Spades", "Hearts", "Diamonds", or "Clubs"
     */
    public String ColorToString() {
        //VOTRE CODE VIENT ICI
        switch (this.color){
            case 0:
                return "CLUBS";
            case 1:
                return "DIAMONDS";
            case 2:
                return "HEARTS";
            case 3:
                return "SPADES";
            default:
                return "No color specified (which isn't possible)";
        }
    }

    /**
     * Returns a String representation of the card's value.
     * @return for a regular card, one of the strings "Ace", "2",
     * "3", ..., "10", "Jack", "Queen", or "King".  
     */
    public String ValueToString() {
        
            //VOTRE CODE VIENT ICI
            switch (this.value){
                case 1:
                    return "Ace";
                case 11:
                    return "Jack";
                case 12:
                    return "Queen";
                case 13:
                    return "King";
                default:
                    return ""+this.value+"";
            }
   }

    /**
     * Returns a string representation of this card, including both
     * its color and its value.  Sample return values is: "Ace of Diamonds", 
     */
    public String toString() {
            return ValueToString() + " of " + ColorToString();
    }


} // end class Card
