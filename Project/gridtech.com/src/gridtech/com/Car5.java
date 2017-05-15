package gridtech.com;

import java.awt.*;

/**
 * Created by jay on 5/11/17.
 */
public class Car5 extends GameObject {
    public Car5(int x, int y, ID id) {
        super(x, y, id);
        velX = 800;
        velY = 0;
    }

    @Override
    public void tick() {
        x = velX--;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 64, 20);
    }
}
