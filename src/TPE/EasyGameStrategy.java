package TPE;

import java.util.ArrayList;

public class EasyGameStrategy implements GameStrategy{

    private int maxRounds;

    public EasyGameStrategy(int maxRounds){
        this.maxRounds = maxRounds;
    }

    public int getMaxRounds() {
        return maxRounds;
    }

    public void setMaxRounds(int maxRounds) {
        this.maxRounds = maxRounds;
    }

    /**
     * @param player1 player to add the cards
     * @param cards cards tod be added to a player
     */
    private void method(Player player1, ArrayList<Card> cards) {
        player1.addCards(cards);
        player1.setTurn(true);
    }

    /**
     * Strategy of the game:
     * Given a game, game have two players, deck and max rounds
     * Win condition:
     * The maximum number of rounds is reached or a player
     * runs out of cards
     * @param game All the structures for play
     */
    @Override
    public void strategyPlay(Game game) {
        Player playerA = game.getPlayerA();
        Player playerB = game.getPlayerB();
        game.getDeckGame().dealCards(playerA, playerB);
        int rounds = 0;
        playerA.setTurn(true);
        while (rounds < maxRounds || playerA.isNotEmpty() || playerB.isNotEmpty()) {
            Card cardPlayerA = playerA.getCard();
            Card cardPlayerB = playerB.getCard();
            String fightAttribute = cardPlayerA.getRandomAttribute();
            int valueCardA = cardPlayerA.getValueAttribute(fightAttribute);
            int valueCardB = cardPlayerB.getValueAttribute(fightAttribute);

            if (valueCardA != valueCardB) {
                ArrayList<Card> cards = new ArrayList<>();
                cards.add(cardPlayerA);
                cards.add(cardPlayerB);
                if (valueCardA > valueCardB)
                    this.method(playerA, cards);
                else
                    this.method(playerB, cards);
            } else {
                ArrayList<Card> cardA = new ArrayList<>();
                cardA.add(cardPlayerA);
                this.method(playerA, cardA);
                ArrayList<Card> cardB = new ArrayList<>();
                cardB.add(cardPlayerB);
                this.method(playerB, cardB);
            }

            rounds++;
        }

        int cardCountA = playerA.getCountCards();
        int cardCountB = playerB.getCountCards();

        if (cardCountA > cardCountB)
            this.printWinner(playerA.getName());
        else if (cardCountA < cardCountB)
            this.printWinner(playerB.getName());
        else
            this.printWinner("Tie");
    }

    public void printWinner(String winner){
        System.out.println(winner);
    }

}