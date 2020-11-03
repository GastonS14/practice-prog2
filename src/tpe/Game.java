package tpe;

import tpe.gameStrategy.GameStrategy;

public class Game {

    private String name;
    private Player playerA;
    private Player playerB;
    private Deck deckGame;
    // private ArrayList<GameStrategy> strategy;// The game has many strategies
    private GameStrategy gameStrategy;

    public Game(String name, Player playerA, Player playerB, Deck deckGame, GameStrategy gameStrategy){
        this.name = name;
        this.playerA = playerA;
        this.playerB = playerB;
        this.deckGame = deckGame;
        // strategy = new ArrayList<>();
        // strategy.add(gameStrategy);
        this.gameStrategy = gameStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public Deck getDeckGame() {
        return deckGame;
    }

    public void setDeckGame(Deck deckGame) {
        this.deckGame = deckGame;
    }

    public GameStrategy getGameStrategy(){
        return this.gameStrategy;
    }

    public void setGameStrategy(GameStrategy gameStrategy){
        this.gameStrategy = gameStrategy;
    }

    public void playGame(){
        gameStrategy.strategyPlay(this);
    }
}
