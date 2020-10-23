package game;

public class Player extends Entity {

    public Player(int cooX, int cooY, int height, int width) {
        super(cooX, cooY);
        this.height = height;
        this.width = width;

    }

    public boolean isColliding(Entity element) {
        double tempCooX = element.cooX;
        double tempCooY = element.cooY;
        double tempHeight = element.height;
        double tempWidth = element.width;
        double averageRadiusX = (tempWidth + this.width) / 2;
        double averageRadiusY = (tempHeight + this.height) / 2;
        if (this.notCollidingOnAxis(tempCooX, this.cooX, averageRadiusX)) {
            if (this.notCollidingOnAxis(tempCooY, this.cooY, averageRadiusY)) {
                System.out.println("true");
                return true;
            } else {
                System.out.println("false");
                return false;
            }
        } else {
            System.out.println("false");
            return false;
        }


    }

    public boolean notCollidingOnAxis(double elemAxis, double playerAxis, double averageRadius) {
        return ((Math.abs(playerAxis - elemAxis) - averageRadius) < 0);
    }
}
