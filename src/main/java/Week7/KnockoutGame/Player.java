package Week7.KnockoutGame;

public class Player {

    private String name;
    private boolean knockedOut; // are they still in the game or not?
    private int knockoutNum;

    public Player(String name) {
        this.name = name;
        knockedOut = false;
    }

    public String playTurn(DiceCup diceCup) {
        int score = diceCup.rollAll();
        if (playerKnockedOut(score)) {
            knockedOut = true;
        }

        String resultTemplate = "Player %s rolled a total of %d and %s knocked out. (Your knockout number was %d)";

        String knockedOutYN = "was not";
        if (knockedOut){
            knockedOutYN = "was";
        }

        return String.format(resultTemplate, name, score, knockedOutYN , knockoutNum);

    }

    public boolean playerKnockedOut(int score) {
        return (score == knockoutNum);
    }

    public boolean isKnockedOut() {
        return knockedOut;
    }

    public void setKnockedOut(boolean knockedOut) {
        this.knockedOut = knockedOut;
    }

    public int getKnockoutNum() {
        return knockoutNum;
    }

    public void setKnockoutNum(int knockoutNum) {
        this.knockoutNum = knockoutNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
