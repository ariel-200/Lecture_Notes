package Week7.KnockoutGame;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.*;

public class Game {

    private DiceCup diceCup;
    private List<Player> players;

    public static void main(String[] args) {

        Game knockout = new Game();
        knockout.startGame();

    }

    public void startGame() {

        diceCup = new DiceCup(2);

        int numPlayers = positiveIntInput("How many players?");

        createPlayers(numPlayers);

        setKnockoutNumbers();

        play();

        printGameResults();

    }


    private void createPlayers(int numPlayers) {

        players = new ArrayList<>();

        for (int x = 0; x < numPlayers; x++) {
            String name = stringInput("What is the name of player " + x + 1 + "?");
            Player player = new Player(name);
            players.add(player);

        }


    }

    private void setKnockoutNumbers() {
        for (Player p: players) {

            int knockoutNum;

            do {
                knockoutNum = intInput("What is player " + p.getName() + "'s knockout number?" +
                        "Must be 6, 7, 8 or 9.");

            } while (knockoutNum < 6 || knockoutNum > 9); // number must be 6,7,8, or 9

            p.setKnockoutNum(knockoutNum);
        }
    }

    private void play() {

        int playerIndex = 0;
        int totalPlayer = players.size();

        while (moreThan1Player()){

            Player currentPlayer = players.get(playerIndex);

            if (currentPlayer.isKnockedOut()) {
                System.out.println("Sorry, " + currentPlayer.getName() + " you are knocked out!");
            } else {
                stringInput("Player " + currentPlayer.getName() + ", press enter to roll.");
                String turnResult = currentPlayer.playTurn(diceCup);
                System.out.println(turnResult);

            }

            playerIndex = (playerIndex + 1) % totalPlayer;

        }

    }

    private boolean moreThan1Player() {

        int totalIn = 0;
        for (Player p: players) {
            if (!p.isKnockedOut()) {
                totalIn++;
            }
        }

        System.out.println("There are " + totalIn + " player(s) left in the game.");
        return (totalIn > 1);
    }

    private void printGameResults() {

        System.out.println(); // Blank Line

        for (Player p: players) {
            if (p.isKnockedOut()) {
                System.out.println("Player " + p.getName() + " was knocked out.");
            } else {
                System.out.println("Player " + p.getName() + " IS THE WINNER!");
            }
        }
    }




}
