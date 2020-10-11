package TPE;

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

    @Override
    public void strategyPlay(Game game){
        Player playerA = game.getPlayerA();
        Player playerB = game.getPlayerB();
        game.getDeckGame().dealCards(playerA, playerB);
        int rounds=0;
        Player turnPlayer = playerA;
        Card turnWinnerCard = playerA.getCard();
        while(rounds < maxRounds || playerA.isNotEmpty() || playerB.isNotEmpty()){
            Card cardPlayerA = playerA.getCard();
            Card cardPlayerB = playerB.getCard();
            // playerTurn = playerA or playerB
            // String fightAttribute = playerTurn.getRandomAttribute();
            String fightAttribute = cardPlayerA.getRandomAttribute();
            int valueCardA = cardPlayerA.getValueAttribute(fightAttribute);
            int valueCardB = cardPlayerB.getValueAttribute(fightAttribute);

            // if valueCardA is the winner -> do
                // playerA.addCards(cardPlayerA, cardPlayerB) -> DOWN
                // playerA.setTurn()
            // if valueCardB is the winner -> do
                // playerB.addCards() -> DOWNS
                // playerB.setTurn
            // if valueCardA == ValueCardB
                // playerA.addCard(cardPlayerA) -> DOWN
                // playerB.addCard(cardPlayerB) -> DOWN

            rounds++;
        }

        //DECIDE WINNER

        // If have a winner
            // print it
        // else
            // tie



            // COMPARE THE VALUES
            // IF WINNER IS NOT NULL
                //THE WINNER
                    // KEEPS THE TWO CARDS AND PUT THEM DOWNS
                        // IMPLEMENT COMPARATOR(COMPARE IS FOR A MORE THAN ONE FILTER)
                    // TAKE THE TURN
            // ELSE
                // RETURN HIS CARDS AND PUT THEM DOWNS
                // THE SAME PLAYER HAS A TURN
    }
}
