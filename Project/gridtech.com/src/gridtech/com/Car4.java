package gridtech.com;

import java.awt.Color;
import java.awt.Graphics;

public class Car4 extends GameObject {

	public Car4(int x, int y, ID id) {
		super(x, y, id);

		velX = 800;
		velY = 0;
	}

	public void tick() {
		x = velX--;

	}

	public void render(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, 64, 20);

	}

}
