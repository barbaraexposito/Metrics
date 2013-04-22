package jankenpon;
public class Player {
    private String name;
    private Weapon choose;

    public Player(String name) {
        this.name = name;
    }

    public Weapon getChoose() {
        return choose;
    }

    public void setChoose(Weapon choose) {
        this.choose = choose;
    }

    public String getName() {
        return name;
    }
}


