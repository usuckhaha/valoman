import javax.swing.*;

public class UserPanel extends JPanel implements JavaArcade {
    public static final String gameName = "Valoman";
    public boolean pause;
    public UserPanel(int x, int y){

    }
    @Override
    public boolean running() {
        return !pause;
    }

    @Override
    public void startGame() {
        pause = false;
        //select agent
        //draw map and stuff
        //spawn ghosts and players
    }

    @Override
    public String getGameName() {
        return gameName;
    }

    @Override
    public void pauseGame() {
        pause = true;
    }

    @Override
    public String getInstructions() {
        return null;
    }

    @Override
    public String getCredits() {
        return null;
    }

    @Override
    public String getHighScore() {
        return null;
    }

    //ran when player's health drops to 0
    @Override
    public void stopGame() {

    }

    @Override
    public int getPoints() {
        return 0;
    }

    @Override
    public void setDisplay(GameStats d) {

    }
}
