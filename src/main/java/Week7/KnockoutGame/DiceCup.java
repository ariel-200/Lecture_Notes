package Week7.KnockoutGame;

import java.util.ArrayList;
import java.util.List;

public class DiceCup {

    private List<Dice> allDice;

    public DiceCup(int numDice) {
        allDice = new ArrayList<>();
        for (int d = 0 ; d < numDice ; d++) {
            Dice dice = new Dice();
            allDice.add(dice);
        }
    }

    public int rollAll(){
        int total = 0;
        for (Dice dice : allDice) {
            total += dice.roll();
        }

        return total;

    }

}
