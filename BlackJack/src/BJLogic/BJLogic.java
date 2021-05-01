package BJLogic;

import cardUtils.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class BJLogic {
    
    private Card nextCard;
    private ArrayList<Player> players;
    private Deck deck;
    
    public BJLogic() {
        this.deck = new Deck();
        this.players = new ArrayList<>(7);
        this.nextCard = null;
        initGame();
    }
    
    public final void initGame() {
        this.players.clear();
        
        this.players.add(new Player("Johan", new Hand()));
        this.players.add(new Player("Sara", new Hand()));
        //this.players.add(new Player("Sara", new Hand()));
        //this.players.add(new Player("Anders", new Hand()));
        this.deck.fill();
        this.deck.shuffleCards();
    }
    
    public int getCardCount() {
        return 52 - deck.getSize();
    }
    
    public Card pickNextCard() {
        if (nextCard == null) {
            this.nextCard = deck.dealCard();
        }
        return nextCard;
    }
    
    public void addCardToPlayer(String playerName) {
        if (nextCard != null) {
            for (int i = 0; i < players.size(); i++) {
                if (players.get(i).getName().equals(playerName)) {
                    this.players.get(i).getHand().add(nextCard);
                }
                
            }
            nextCard = null;
        }
    }
    
    public List<Player> getPlayers() {
        List<Player> tmp = (ArrayList<Player>) players.clone();
        return tmp;
    }
    
    public boolean isGameOver(String playerName) {
        return getCardValue(playerName) >= 21;
    }

    /**
     * Get value of cards in one player's hand
     *
     * @param playerName
     * @return
     */
    private int getCardValue(String playerName) {
        int value = 0;
        for (int i = 0; i < players.size(); i++) {
            if ((players.get(i).getName()).equals(playerName)) {
                for (int j = 0; j < players.get(i).getHand().getSize(); j++) {
                    switch (players.get(i).getHand().get(j).getRank()) {
                        case ACE:
                            // Handle this correct
                            value += 1;
                            value += 11;
                            break;
                        
                        case TWO:
                            value += 2;
                            break;
                        
                        case THREE:
                            value += 3;
                            break;
                        
                        case FOUR:
                            value += 4;
                            break;
                        
                        case FIVE:
                            value += 5;
                            break;
                        
                        case SIX:
                            value += 6;
                            break;
                        
                        case SEVEN:
                            value += 7;
                            break;
                        
                        case EIGHT:
                            value += 8;
                            break;
                        
                        case NINE:
                            value += 9;
                            break;
                        
                        case TEN:
                            value += 10;
                            break;
                        
                        case JACK:
                            value += 10;
                            break;
                        
                        case QUEEN:
                            value += 10;
                            break;
                        
                        case KING:
                            value += 10;
                            break;
                    }
                }
            }
        }
        
        System.out.println(value);
        return value;
    }
    
    public void playerBet(String playerName, int amount) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equals(playerName)) {
                players.get(i).betChips(amount);
            }
        }
    }

    @Override
    public String toString() {
        String info = "";
        info += players + "\n";
        return info;
    }
}
