package tpe;

import tpe.potion.Potion;

public class Game {

    private int maxRounds;
    private Player turnPlayer;
    private Player nextPlayer;
    private Deck deckGame;

    public Game(int maxRounds, Player playerA, Player playerB, Deck deckGame){
        this.maxRounds = maxRounds;
        this.turnPlayer = playerA;
        this.nextPlayer = playerB;
        this.deckGame = deckGame;
    }

    public int getMaxRounds() {
        return maxRounds;
    }

    public Player getTurnPlayer() {
        return turnPlayer;
    }

    public Player getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(Player nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    public Deck getDeckGame() {
        return deckGame;
    }

    public void setDeckGame(Deck deckGame) {
        this.deckGame = deckGame;
    }

    public void play(){
        this.deckGame.dealCards(turnPlayer, nextPlayer);
        int roundsPlayed = 0;
        while (!this.isGameFinished(roundsPlayed)) {
            Card turnPlayerCard = turnPlayer.getCard();
            Card nextPlayerCard = nextPlayer.getCard();
            String fightAttribute = turnPlayer.getFightAttribute(turnPlayerCard);
            Player roundWinner = getRoundWinner(turnPlayerCard, nextPlayerCard, fightAttribute);

            if (roundWinner == null) {
                turnPlayer.addCard(turnPlayerCard);
                nextPlayer.addCard(nextPlayerCard);
            } else {
                roundWinner.addCard(nextPlayerCard);
                roundWinner.addCard(turnPlayerCard);
                if(!roundWinner.equals(turnPlayer))
                    changeTurn(roundWinner);
            }

            roundsPlayed++;
        }

        this.printWinner(turnPlayer, nextPlayer);
    }

    private void changeTurn(Player roundWinner) {
        Player aux = turnPlayer;
        turnPlayer = roundWinner;
        nextPlayer = aux;
    }

    private boolean isGameFinished(int roundsPlayed) {
        return roundsPlayed >= maxRounds || !turnPlayer.hasCards() || !nextPlayer.hasCards();
    }

    private void printWinner(String winner){
        System.out.println(winner);
    }

    private void printWinner(Player playerA, Player playerB){
        int cardCountA = playerA.getCountCards();
        int cardCountB = playerB.getCountCards();

        if (cardCountA > cardCountB)
            this.printWinner(playerA.getName());
        else if (cardCountA < cardCountB)
            this.printWinner(playerB.getName());
        else
            this.printWinner("Tie");
    }

    private Player getRoundWinner(Card turnPlayerCard, Card nextPlayerCard, String attribute) {
        int valueTurn = applyPotionAndGetValue(turnPlayerCard, attribute);
        int valueNext = applyPotionAndGetValue(nextPlayerCard, attribute);

        if (valueTurn > valueNext)
            return turnPlayer;
        else if (valueTurn < valueNext)
            return nextPlayer;
        else
            return null;
    }

    private int applyPotionAndGetValue(Card card, String attribute){
        Potion potion = card.getPotion();
        if (potion != null)
            return potion.getValue(card, attribute);
        return card.getValueAttribute(attribute);
    }
}


/*
CODIGO MEJORADO
            if (roundWinner != null) {
                roundWinner.addCard(nextPlayerCard);
                roundWinner.addCard(turnPlayerCard);
            } else {
                turnPlayer.addCard(turnPlayerCard);
                nextPlayer.addCard(nextPlayerCard);
            }

            if (roundWinner != null && !roundWinner.equals(turnPlayer))
                changeTurn(roundWinner);

*/

