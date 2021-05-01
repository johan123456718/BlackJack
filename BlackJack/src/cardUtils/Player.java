package cardUtils;

/**
 *
 * @author saraonval
 */
public class Player {
    
    private int chips;
    private String name;
    private Hand hand;
    
    public Player(String name, Hand hand) {
        this.chips = 1000;
        this.name = name;
        this.hand = hand;
    }
    
    public int getChips() {
        return this.chips;
    }
    
    public void addChips(int amount) {
        if(amount >= 0){
            chips += amount;
        }
        else {
            throw new IllegalArgumentException("Amount below 0");
        }
    }
    
    public void betChips(int amount){
        if(amount >= 0){
            chips -= amount;
        }else {
            throw new IllegalArgumentException("Amount below 0");
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public Hand getHand() {
        return this.hand;
    }
    
    @Override
    public String toString() {
        String info = "\nPlayer ["+name+"], chips: " + chips + ", hand: " + hand.toString();
        return info;
    }
}