package game;
import java.util.ArrayList;

public class MyGame {
    public static void main(String[] args){
        ArrayList<Entity> entities = new ArrayList<Entity>();
        Player pl1 = new Player(1, 5, 4, 5);
        Wall wl1 = new Wall(2, 4, true, 6);
        entities.add(wl1);
        for (Entity element: entities) {
            pl1.isColliding(element);
        }
    }
}
