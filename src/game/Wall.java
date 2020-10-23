package game;

public class Wall extends Entity {
    boolean side; // boolean side - if true size refers to height and width is 1, if false evrything's reversed
    int size;

    public Wall(int cooX, int cooY,  boolean side, int size)
    {
        super(cooX,cooY);
        this.side = side;
        this.size = size;

        if(side){
            this.height = size;
            this.width = 1;
        } else {
            this.width = size;
            this.height = 1;
        }
    }
}
