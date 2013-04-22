package jankenpon;
public class JanKenPon {
    private Player playerA;
    private Player playerB;

    public JanKenPon(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }
    
    public Result play(){
        return Clash.confront(playerA, playerB);
    }

    public Player getPlayerA() {
        return playerA;
    }

    public void setPlayerA(Player aPlayer) {
        this.playerA = aPlayer;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public void setPlayerB(Player bPlayer) {
        this.playerB = bPlayer;
    }
}
