package jankenpon;

public class Result {

    public static final Result A_PLAYER_WINS = new Result("player A wins", 1);
    public static final Result A_PLAYER_LOSES = new Result("player A loses", -1);
    public static final Result DEAD_HEAD = new Result("dead head", 0);
    private String description;
    private int result;

    private Result(String result, int value) {
        this.description = result;
        this.result = value;
    }

    public String getDescription() {
        return description;
    }

    public int getResult() {
        return result;
    }
}
