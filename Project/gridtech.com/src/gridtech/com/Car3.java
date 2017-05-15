package gridtech.com;

import java.awt.Color;
import java.awt.Graphics;

public class Car3 extends GameObject {

	public Car3(int x, int y, ID id) {
		super(x, y, id);
		//
		velX = 800;
		velY = 0;

	}

	public void tick() {
		x = velX--;

	}

	public void render(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(x, y, 64, 20);

	}
}
