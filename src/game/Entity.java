package game;

abstract public class Entity {
    int cooX;
    int cooY;

    int height;
    int width;

    public enum type {
        ALLIED,
        PLAYER,
        ENEMY,
        NEUTRAL
    };

    public Entity (int cooX, int cooY){
        this.cooX = cooX;
        this.cooY = cooY;
    }
}
