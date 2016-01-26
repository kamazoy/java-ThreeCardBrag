
/**
 * Abstract class HandRank - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class HandRank
{
    // instance variables - replace the example below with your own
    protected BragHand rankOf;
    protected int numericRank;
    protected BragHand hand;

    public HandRank(BragHand newHand)
    {
        hand = newHand;
    }
    abstract boolean isValid();
    abstract int numericRank();
    abstract String name();
}
