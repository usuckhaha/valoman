import java.awt.*;

public class Player extends Character{
    private final static String[] ability = {"dash", "wall", "trip" };
    private final int a;
    public Player(int a){
        this.a = a;
        hp = 100;
        r = 10;
        switch(a){
            case 1:
                color = Color.white;
                break;
            case 2:
                color = Color.cyan;
                break;
            case 3:
                color = Color.pink;
        }

    }
    @Override
    public void eatFruit() {

    }
}
