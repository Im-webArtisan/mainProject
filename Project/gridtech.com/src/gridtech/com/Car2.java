package gridtech.com;

import java.awt.Color;
import java.awt.Graphics;

public class Car2 extends GameObject{

	public Car2(int x, int y, ID id) {
		super(x, y, id);
		 velX = 0;
		 velY =0;
	}


	public void tick() {
		x = velX++;
		
	}


	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(x, y, 64, 20);
//		g.setColor(Color.pink);
//		g.fillRect(x,y,64, 20);
		
	}

}
