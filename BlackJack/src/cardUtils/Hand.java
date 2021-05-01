package cardUtils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Hand {
    private ArrayList<Card> theCards;
    
    public Hand(){
        this.theCards = new ArrayList<>();
    }
    
    public int getSize(){
        return theCards.size();
    }
    
    public void clear(){
        theCards.clear();
    }
    
    public void add(Card c){
        theCards.add(c);
    }
    
    public void add(List<Card> cards){
        theCards.addAll(cards);
    }
    
    public Card get(int position){
        return theCards.get(position);
    }
    
    public List<Card> get(){
        List<Card> tmp = (ArrayList<Card>)theCards.clone();
        return tmp;
    }
    
    public Card remove(int position){
        return theCards.remove(position);
    }
    
    public boolean remove(Card c){
        return theCards.remove(c);
    }
    
    public boolean contains(Card c){
        return theCards.contains(c);
    }
    
    @Override
    public String toString(){
        String info = "";
        info += theCards;
        return info;
    }
}
