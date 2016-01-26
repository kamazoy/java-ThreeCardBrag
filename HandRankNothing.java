
/**
 * Write a description of class HandRankNothing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HandRankNothing extends HandRank
{
    // instance variables
    public HandRankNothing(BragHand newHand)
    {
        super(newHand);
    }

    String name() {return "Flush";}
    int numericRank() {return 2;}
    
    public boolean isValid()
    {
         /* ensure it is not a valid hand
          * by calling the isValid method of other classes?
          */
         
         return false;
    }
    
}