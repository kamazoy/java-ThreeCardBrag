
/**
 * Write a description of class ThreeThrees here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThreeThrees extends HandRank
{
    // instance variables - replace the example below with your own
    private int x;

    public ThreeThrees(BragHand newHand)
    {
        super(newHand);
    }

    String name() {return "Three Threes";}
    int numericRank() {return 6;}
    
    public boolean isValid()
    {
        return hand.cards[0].rank == 3
            && hand.cards[1].rank == 3
            && hand.cards[2].rank == 3;
    }
    
}
