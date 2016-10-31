package BlackJack;

import BlackJack.controller.*;
import BlackJack.model.Game;
import BlackJack.view.*;

public class Program {

    public static void main(String[] a_args) {

        Game g = new Game();
        IView v = new SimpleView(); //new SwedishView();
        PlayGame ctrl = new PlayGame(g, v);

        while (ctrl.Play());
    }
}
