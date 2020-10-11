package TPE;

public class Player {

    private String name;
    private Boolean myTurn;
    private Deck deck;

    public Player(String name){
        this.name = name;
        this.myTurn = false;
        this.deck = new Deck("Deck");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isMyTurn() {
        return myTurn;
    }

    public void setMyTurn(Boolean myTurn) {
        this.myTurn = myTurn;
    }

    public void addCard(Card card){
        deck.addCard(card);
    }

    public boolean isNotEmpty(){
        return deck.getSize() > 0;
    }

    public Card getCard(){
        return deck.getCard();
    }
}
