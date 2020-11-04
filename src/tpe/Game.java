package tpe;

import tpe.potion.Potion;

import java.util.ArrayList;

public class Game {

    private int maxRounds;
    private Player turnPlayer;
    private Player nextPlayer;
    private Deck deckGame;
    private ArrayList<Potion> potions;

    public Game(int maxRounds, Player playerA, Player playerB, Deck deckGame){
        this.maxRounds = maxRounds;
        this.turnPlayer = playerA;
        this.nextPlayer = playerB;
        this.deckGame = deckGame;
        this.potions = new ArrayList<>();
    }

    public void addPotion(Potion potion){
        potions.add(potion);
    }

    public boolean hasPotions() {
        return !potions.isEmpty();
    }

    public void dealPotions() {
        if ( deckGame.hasCards()) {
            for (int i = 0; i < potions.size(); i++) {
                Potion potion = potions.get(i);
                Card card = deckGame.getCardWithoutPotion();
                if (card != null)
                    card.setPotion(potion);
            }
        }
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
        if (hasPotions())
            dealPotions();
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
            }

            roundsPlayed++;
            printRound(fightAttribute, turnPlayerCard, nextPlayerCard, roundWinner, roundsPlayed);
            if (roundWinner != null)
                if(!roundWinner.equals(turnPlayer))
                    changeTurn(roundWinner);

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

    private void printRound(String attribute, Card turnPlayerCard, Card nextPlayerCard, Player roundWinner, int roundsPlayed) {
        String extraMsgTurnPlayer = "";
        String extraMsgNextPlayer = "";
        String winner;

        if (turnPlayerCard.hasPotion())
            extraMsgTurnPlayer = this.getPotionMessage(turnPlayerCard, attribute);

        if (nextPlayerCard.hasPotion())
            extraMsgNextPlayer = this.getPotionMessage(nextPlayerCard, attribute);

        if (roundWinner == null)
            winner = "Nadie. Hubo empate";
        else
            winner = roundWinner.getName();
        String msg =
                "------- Ronda " + roundsPlayed + " -------\n" +
                        "\nEl jugador " + turnPlayer.getName() +
                        " selecciona competir por el atributo " + attribute +
                        "\nLa carta de " + turnPlayer.getName() + " es " + turnPlayerCard.getHeroName() +
                        " con " + attribute + " " + turnPlayerCard.getValueAttribute(attribute) + extraMsgTurnPlayer +
                        "\nLa carta de " + nextPlayer.getName() + " es " + nextPlayerCard.getHeroName() +
                        " con " + attribute + " " + nextPlayerCard.getValueAttribute(attribute) + extraMsgNextPlayer +
                        "\nGana la ronda: " + winner + "\n" +
                        turnPlayer.getName() + " posee ahora " + turnPlayer.getCountCards() +
                        " cartas y " + nextPlayer.getName() + " posee ahora " +
                        nextPlayer.getCountCards() + " cartas\n";

        printWinner(msg);
    }

    private String getPotionMessage(Card card, String attribute){
        Potion potion = card.getPotion();
        String message;
        message = ", se aplicó pócima\n" +potion.getName();
        return message;
    }
}

