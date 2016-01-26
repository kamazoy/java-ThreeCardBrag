
/**
 * Write a description of class ThreeOfAKind here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThreeOfAKind extends HandRank
{
    // instance variables
    public ThreeOfAKind(BragHand newHand)
    {
        super(newHand);
    }

    String name() {return "Three of a Kind";}
    int numericRank() {return 5;}
    
    public boolean isValid()
    {
        return hand.cards[0].rank == 
               hand.cards[1].rank &&
               hand.cards[1].rank ==
               hand.cards[2].rank;
    }
    
}
