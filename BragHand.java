import java.util.*;

/**
 * Write a description of class BragHand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BragHand
{
    // instance variables - replace the example below with your own
    Card[] cards;

    /**
     * Constructor for objects of class BragHand
     */
    public BragHand(Card[] cardsInput)
    {
        cards = cardsInput;
        
        if(cardsInput.length != 3)
        {
            throw new IllegalArgumentException("Not enough cards passed to the array");
        }
        
        Arrays.sort(cards);
    }
    
    public void print()
    {
        System.out.println(cards[0] + " " + cards[1] + " " + cards[2]);
    }
}
