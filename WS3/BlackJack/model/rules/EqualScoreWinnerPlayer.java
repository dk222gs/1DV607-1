package BlackJack.model.rules;

import BlackJack.model.Player;

/**
 *
 * @author olgachristensen
 */
public class EqualScoreWinnerPlayer implements IWinnerStrategy {
    
    @Override
    public boolean IsDealerWinner(Player a_player, Player a_dealer, int g_maxScore) {
        if (a_player.CalcScore() > g_maxScore) {
            return true;
        } else if (a_dealer.CalcScore() > g_maxScore) {
            return false;
        } else if (a_dealer.CalcScore() == a_player.CalcScore()) {
            return false;
        }
        return a_dealer.CalcScore() > a_player.CalcScore();
    }
}
