package game;
import java.util.ArrayList;

public class MyGame {
    public static void main(String[] args){
        ArrayList<Entity> entities = new ArrayList<Entity>();
        Player pl1 = new Player(1, 5, 4, 5);

        Wall wl1 = new Wall(2, 4, true, 6);
        entities.add(wl1);
        Wall wl4 = new Wall(2, 8, false, 6);
        entities.add(wl4);
        Wall wl2 = new Wall(2, 0, true, 3);
        entities.add(wl2);
        Wall wl3 = new Wall(-10, 4, false, 18);
        entities.add(wl3);
        Wall wl5 = new Wall(-10, 4, true, 17);
        entities.add(wl5);

        for (Entity element: entities) {
            pl1.isColliding(element);
        }
    }
}
