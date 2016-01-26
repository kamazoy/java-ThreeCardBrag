
/**
 * Write a description of class Straight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Straight extends HandRank
{
    // instance variables
    public Straight(BragHand newHand)
    {
        super(newHand);
    }

    String name() {return "Straight";}
    int numericRank() {return 3;}
    
    public boolean isValid()
    {
        return (hand.cards[0].rank +1 == hand.cards[1].rank &&
                hand.cards[1].rank +1 == hand.cards[2].rank)
                ||
               (hand.cards[0].rank == 2 &&
                hand.cards[1].rank == 3 &&
                hand.cards[2].isAce());
    }
    
}
