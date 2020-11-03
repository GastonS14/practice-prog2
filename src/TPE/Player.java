package tpe;

import tpe.gameStrategy.GameStrategy;

public class Player {

    private String name;
    private Deck deck;
    private GameStrategy gameStrategy;

    public Player(String name, GameStrategy gameStrategy){
        this.name = name;
        this.gameStrategy = gameStrategy;
        this.deck = new Deck();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameStrategy getGameStrategy() {
        return gameStrategy;
    }

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void addCard(Card card){
        deck.addCard(card);
    }

    public Card getCard(){
        return deck.getCard();
    }

    public int getCountCards(){
        return this.deck.getSize();
    }

    public String getFightAttribute(Card card){
        return gameStrategy.getAttribute(card);
    }

    public boolean hasCards(){
        return deck.getSize() > 0;
    }


}
