
/**
 * Write a description of class Flush here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flush extends HandRank
{
    // instance variables
    public Flush(BragHand newHand)
    {
        super(newHand);
    }

    String name() {return "Flush";}
    int numericRank() {return 2;}
    
    public boolean isValid()
    {
        return hand.cards[0].suit == 
               hand.cards[1].suit &&
               hand.cards[1].suit ==
               hand.cards[2].suit;
    }
    
}