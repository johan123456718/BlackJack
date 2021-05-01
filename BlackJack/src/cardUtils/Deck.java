
package cardUtils;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
public class Deck {
    private ArrayList<Card> theCards;
    public Deck(){
        this.theCards = new ArrayList<>(52);
        fill();
    }
    public int getSize(){
        return theCards.size(); 
    }
    
    public Card dealCard(){
        return theCards.remove(0);
    }
    
    public  void shuffleCards(){
        Collections.shuffle(theCards);
    }
    
    public final void fill(){
        theCards.clear();
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();
        for (Rank rank : ranks) {
            for (Suit suit : suits) {
                theCards.add(new Card(rank, suit));
            }
        }
    }
    
    @Override
    public String toString(){
        String info =  "";
        info += theCards;
        return info;
    }
}
