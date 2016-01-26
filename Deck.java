import java.util.*;

/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck
{
    // instance variables
    List<Card> myDeck;   // has a variable called 'cards' which is a list containing
                        // objects of class 'Card'
    

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        // initialise deck
        myDeck = new ArrayList<Card>();
        for(int rank = 2; rank <= 14; rank++)
        {
            for(char suit : new char[] {'h','c','s','d'}) 
            {
                myDeck.add(new Card(rank,suit));
            }
        }
    }
    
    public void shuffleDeck(){
        long seed = System.nanoTime();
        Collections.shuffle(myDeck, new Random(seed));
    }
    
    public BragHand drawHand()
    {
        Card[] myCards = new Card[3];
        Card chosenCard;        
        for(int a=0; a<3; a++){
          // get a card from the top and add it
          myCards[a] = myDeck.remove(0);
        }
        
        BragHand myHand = new BragHand(myCards);
        return myHand;
    }

    
}
