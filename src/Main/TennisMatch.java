package Main;

public class TennisMatch {

    private Player player1;
    private Player player2;
    private MatchType matchType;
    private boolean tieBreakInLastSet;

    public TennisMatch(Player playerOne, Player playerTwo, MatchType matchType, boolean tieBreakInLastSet){
        this.player1 = playerOne;
        this.player2 = playerTwo;
        this.matchType = matchType;
        this.tieBreakInLastSet = tieBreakInLastSet;
    }

    public void updateWithPointWonBy(Player player){
       player.setPoints(player.getPoints()+1);
    }

    public String pointsForPlayer(Player player){
        return "";
    }

    public int currentSetNumber(){
        return 0;
    }

    public int gamesInCurrentSetForPlayer(Player player){
        return 0;
    }

    public int gamesInSetForPlayer(int numberOfSet, Player player){
        return 0;
    }

    public boolean isFinished(){
        return false;
    }

    //Getters & Setters, toString

    @Override
    public String toString() {
        return "TennisMatch{" +
                "player1=" + player1 +
                ", player2=" + player2 +
                ", matchType=" + matchType +
                ", tieBreakInLastSet=" + tieBreakInLastSet +
                '}';
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public boolean isEquality() {
        return tieBreakInLastSet;
    }

    public void setEquality(boolean tieBreakInLastSet) {
        this.tieBreakInLastSet = tieBreakInLastSet;
    }
}
