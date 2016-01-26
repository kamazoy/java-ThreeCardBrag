
/**
 * Write a description of class StraightFlush here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StraightFlush extends HandRank
{
    // instance variables
    public StraightFlush(BragHand newHand)
    {
        super(newHand);
    }

    String name() {return "Straight Flush";}
    int numericRank() {return 4;}
    
    public boolean isValid()
    {
        return (hand.cards[0].rank < hand.cards[1].rank &&
               hand.cards[1].rank < hand.cards[2].rank) 
               &&
               (hand.cards[0].suit == hand.cards[1].suit &&
               hand.cards[0].suit == hand.cards[2].suit);
    }
    
}
