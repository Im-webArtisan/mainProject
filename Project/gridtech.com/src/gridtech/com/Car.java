package gridtech.com;

import java.awt.Color;
import java.awt.Graphics;

public class Car extends GameObject {

    public  int a = 4;
	public Car(int x, int y, ID id) {
		super(x, y, id);
		velX = 0;
		velY = 0;

	}


	public void tick() {

		x = velX++;
	}


	public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(x, y, 64, 20);
    }
}
