import java.awt.*;

public class Ghost extends Character{
    private static boolean edible;  //we need to define how collisions are gonna work, when this is done we can figure out how the player is gonna eat the ghosts
    public Ghost(){
        hp = 100;
        r = 10;
        color = Color.red;
        speed = 1;
        edible = false;
    }
    @Override
    public void eatFruit() {
        speed = 5;
    }
}
