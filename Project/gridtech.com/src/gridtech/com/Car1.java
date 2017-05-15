package gridtech.com;

import java.awt.*;

/**
 * Created by jay on 5/11/17.
 */
public class Car1 extends GameObject {
    public Car1(int x, int y, ID id) {
        super(x, y, id);
        velX = 0;
        velY = 0;
    }

    @Override
    public void tick() {
        if (x >= 0 || y<= 110) {
            x = velX++;
        }

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, 64, 20);
    }
}
