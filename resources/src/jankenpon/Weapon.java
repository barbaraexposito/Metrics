package jankenpon;

import jankenpon.weapons.Paper;
import jankenpon.weapons.Rock;
import jankenpon.weapons.Scissors;

public abstract class Weapon {

    public static final Rock ROCK = new Rock("Rock");
    public static final Paper PAPER = new Paper("Paper");
    public static final Scissors SCISSORS = new Scissors("Scissors");
    private String name;

    protected Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
