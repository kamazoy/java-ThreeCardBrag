
/**
 * Write a description of class Pair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pair extends HandRank
{
    // instance variables
    public Pair(BragHand newHand)
    {
        super(newHand);
    }

    String name() {return "Pair";}
    int numericRank() {return 1;}
    
    public boolean isValid()
    {
        return hand.cards[0].rank == hand.cards[1].rank ||
               hand.cards[1].rank == hand.cards[2].rank ||
               hand.cards[0].rank == hand.cards[2].rank
               
               ||
               
               hand.cards[0].suit == hand.cards[1].suit ||
               hand.cards[1].suit == hand.cards[2].suit ||
               hand.cards[0].suit == hand.cards[2].suit;
    }
    
}