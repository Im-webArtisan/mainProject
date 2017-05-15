package gridtech.com;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject {

	Random r = new Random();

	public Player(int x, int y, ID id) {
		super(x, y, id);

		// velX = 5 + 1;
		velY = 0;

	}

	public void tick() {
		int limit = 0;
		while (limit < 5) {
			//java.awt.Toolkit.getDefaultToolkit().beep();
			x = velX++;
			limit++;
		}
		/*
		 * x += velX; y += velY;
		 * 
		 * x = Game.clamp(x, 0,Game.WIDTH - 32); y = Game.clamp(y, 0,Game.HEIGHT
		 * - 64);
		 */

	}

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 50, 20);

	}

}
