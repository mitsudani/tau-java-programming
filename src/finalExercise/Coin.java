package finalExercise;

import java.util.Random;

public class Coin {

    private String side;

    static final String[] HEAD_OR_TAIL = {"Head", "Tail"};

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void flip() {
        this.side = (HEAD_OR_TAIL[new Random().nextInt(HEAD_OR_TAIL.length)]);
    }
}
