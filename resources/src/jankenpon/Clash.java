package jankenpon;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clash {

    private static final HashMap<String, Method> methods;

    static {
        methods = new HashMap<>();
        for (Method method : Clash.class.getDeclaredMethods())
            methods.put(method.getName(), method);
    }

    public static Result confront(Player playerA, Player playerB) {
        try {
            return (Result) methods.get(getSignature(playerA, playerB)).invoke(new Clash(), null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Clash.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private static Result confrontRockPaper() {
        return Result.A_PLAYER_LOSES;
    }

    private static Result confrontPaperRock() {
        return Result.A_PLAYER_WINS;
    }

    private static Result confrontRockScissors() {
        return Result.A_PLAYER_WINS;
    }

    private static Result confrontScissorsRock() {
        return Result.A_PLAYER_LOSES;
    }

    private static Result confrontScissorsPaper() {
        return Result.A_PLAYER_WINS;
    }

    private static Result confrontPaperScissors() {
        return Result.A_PLAYER_LOSES;
    }

    private static Result confrontPaperPaper() {
        return Result.DEAD_HEAD;
    }

    private static Result confrontRockRock() {
        return Result.DEAD_HEAD;
    }

    private static Result confrontScissorsScissors() {
        return Result.DEAD_HEAD;
    }

    private static String getSignature(Player playerA, Player playerB) {
        return new StringBuilder("confront").append(playerA.getChoose().getName()).append(playerB.getChoose().getName()).toString();
    }
}
