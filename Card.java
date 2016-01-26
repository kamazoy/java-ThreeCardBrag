import java.util.*;

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card implements Comparable<Card>
{
    // instance variables
    protected int rank;
    protected char suit;  // h=hearts, c=clubs, d=diamonds, s=spades
    public boolean isAce() {return rank == 14;}
    

    /**
     * Constructor for objects of class Card
     */
    public Card(int rank, char suit)
    {
        // initialise instance variables
        if(rank >= 2 && rank <= 14)
        {
            this.rank = rank;
        }else{
            throw new ArithmeticException("Card's rank must be 0 to 14");
        }
        
        if(suit == 'd' || suit == 'c' || suit == 'h' || suit == 's')
        {
            this.suit = suit;
        }else{
            throw new ArithmeticException("Card's suit must be 'c', 'd', 'h', or 's'");
        }
        
        
    }

    @Override  
    public boolean equals(Object other)
    {
        // overriding the 'equals' method so we can see if two cards are identical
        if(other instanceof Card){
            Card otherCard = (Card)other;
            return rank == otherCard.rank && suit == otherCard.suit;
        }else{
            return false;
        }
        // without this, equals against two cards would always return false as
        // memory locations are not identical
    }
    
    public int compareTo(Card otherCard)
    {
        /*if(otherCard.rank < rank) {return -1;}
        if(otherCard.rank > rank) {return 1;}
        return 0; */
        
        return Integer.compare(rank, otherCard.rank);
    }
    
    @Override
    public int hashCode()
    {
        // we are overriding hashCode because we also overrode equals
        // (see http://netjs.blogspot.co.uk/2015/06/overriding-hashcode-and-equals-method.html)
        // hash is generated on the rank integer and the suit's ascii value
        
        return (int)suit * (int)suit * rank;
    }
    
    @Override
    public String toString()
    {
        // Override toString method to give a useful representation of what this object contains
        
        String rankString;
        if(rank==10){rankString="T";}
        else if(rank==11){rankString="J";}
        else if(rank==12){rankString="Q";}
        else if(rank==13){rankString="K";}
        else if(rank==14){rankString="A";}
        else{rankString = Integer.toString(rank);}
        
        return rankString + Character.toString(suit);
        
        /*
         * Card tenofclubs = new Card(10,'c');
         * tenofclubs.toString()
         >> "Tc"   (String)
         * System.out.println(tenofclubs)
         >> Tc
         */
    }
    
}

