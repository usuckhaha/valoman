import java.awt.*;

public abstract class Character {
    protected int hp, r, speed;
    protected Graphics shape;
    protected Color color;

    public void draw(int x, int y){
        shape.setColor(color);
        shape.fillOval(x,y,r,r);
    }
    public int getHp(){ return hp; }
    public void takeDmg(int dmg){ hp-=dmg; }
    public abstract void eatFruit();
    public hi;
}
