import java.awt.*;

public class Player extends Character{
    private final static String[] ability = {"dash", "wall", "trip" };
    private final int a;
    public Player(int a){
        this.a = a;
        hp = 100;
        r = 10;
        speed = 1;
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
        hp += 50;  //SHIELD (extra)>we could draw a slightly bigger circle on top of the actual character and set transparency to 20%so it looks like a halo
    }
}
