package game;

import java.util.ArrayList;

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
        double averageRadiusX = (tempWidth + this.width) / 4;
        double averageRadiusY = (tempHeight + this.height) / 4;
        if (!this.distanceOnAxis(element, tempCooX, this.cooX, averageRadiusX)) {
            if (!this.distanceOnAxis(element, tempCooY, this.cooY, averageRadiusY)) {
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

    public boolean distanceOnAxis(Entity element, double elemAxis, double playerAxis, double averageRadius) {
        if ((Math.abs(playerAxis - elemAxis) - averageRadius) < 0) {
            return false;
        } else {
            return true;
        }

    }
}
