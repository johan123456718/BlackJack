import cardUtils.*;
import BJLogic.BJLogic;
public class testMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Card card = new Card(Rank.ACE, Suit.DIAMONDS);
       Deck deck = new Deck();
       System.out.println(deck);
       
       // Player
       Hand hand = new Hand();
       Player player = new Player("Johan", hand);
       System.out.println(player);
       
       //BJLogic
       BJLogic logic = new BJLogic();
       logic.pickNextCard();
       logic.addCardToPlayer(player.getName());
       logic.pickNextCard();
       logic.addCardToPlayer(player.getName());
       logic.pickNextCard();
       logic.addCardToPlayer(player.getName());
       logic.playerBet(player.getName(), 200);
       
       System.out.println(logic);
       
       System.out.println(logic.isGameOver(player.getName()));
    }
    
}