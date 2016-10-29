package BlackJack.model.rules;

import BlackJack.model.Dealer;
import BlackJack.model.Player;

class InternationalNewGameStrategy implements INewGameStrategy {

    public boolean NewGame(Dealer a_dealer, Player a_player) {
        /*
        Card c;

        c = a_deck.GetCard();
        c.Show(true);
        a_player.AddCardToHand(c);

        c = a_deck.GetCard();
        c.Show(true);
        a_dealer.AddCardToHand(c);

        c = a_deck.GetCard();
        c.Show(true);
        a_player.AddCardToHand(c);
        */
        
        
        a_dealer.DealCard(a_player, true);
        
        a_dealer.DealCard(a_dealer, true);
        
        a_dealer.DealCard(a_player, true);
        
        
        return true;
    }
}
