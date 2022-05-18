import java.awt.*;

public abstract class Character {
    protected int hp, r, speed, row, col;  //row and col values that go in the map array to get x and y
    protected Graphics shape;  //they're all circles lol
    protected Color color;   //it changes depending on the player's abilities or if it's a ghost

    public void draw(int x, int y){
        shape.setColor(color);
        shape.fillOval(x,y,r,r);
    }
    public int getHp(){ return hp; }
    public void takeDmg(int dmg){ hp-=dmg; }
    public abstract void eatFruit();
}