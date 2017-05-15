package gridtech.com;

import java.awt.Color;
import java.awt.Graphics;

public class Road extends GameObject {

	public Road(int x, int y, ID id) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
	}

	public void tick() {
		// TODO Auto-generated method stub

	}

	public void render(Graphics g) {
		// two way simulation
		g.setColor(Color.white);
		g.drawString("Two_Way Simulation", 400, 80);
		g.drawLine(0, 100, 900, 100);
		g.drawLine(0, 200, 900, 200);
		// middle lines drawing
		g.drawLine(0, 150, 50, 150);
		g.drawLine(140, 150, 190, 150);
		g.drawLine(280, 150, 320, 150);
		g.drawLine(410, 150, 460, 150);
		g.drawLine(540, 150, 590, 150);
		g.drawLine(680, 150, 730, 150);
		g.drawLine(810, 150, 860, 150);
		g.setColor(Color.yellow);
		g.drawLine(70, 150, 120, 150);
		g.drawLine(210, 150, 260, 150);
		g.drawLine(340, 150, 390, 150);
		g.drawLine(480, 150, 520, 150);
		g.drawLine(610, 150, 660, 150);
		g.drawLine(750, 150, 790, 150);
		g.drawLine(880, 150, 930, 150);

		// highway simulation
		g.setColor(Color.white);
		g.drawString("High_Way Simulation", 400, 330);
		g.drawLine(0, 350, 900, 350);
		g.drawLine(0, 550, 900, 550);

		// middle lines drawing
		// first lane
		g.drawLine(0, 400, 50, 400);
		g.drawLine(140, 400, 190, 400);
		g.drawLine(280, 400, 320, 400);
		g.drawLine(410, 400, 460, 400);
		g.drawLine(540, 400, 590, 400);
		g.drawLine(680, 400, 730, 400);
		g.drawLine(810, 400, 860, 400);
		g.setColor(Color.yellow);
		g.drawLine(70, 400, 120, 400);
		g.drawLine(210, 400, 260, 400);
		g.drawLine(340, 400, 390, 400);
		g.drawLine(480, 400, 520, 400);
		g.drawLine(610, 400, 660, 400);
		g.drawLine(750, 400, 790, 400);
		g.drawLine(880, 400, 930, 400);

		// middle lines drawing
		// second lane
		g.setColor(Color.white);
		g.drawLine(0, 450, 50, 450);
		g.drawLine(140, 450, 190, 450);
		g.drawLine(280, 450, 320, 450);
		g.drawLine(410, 450, 460, 450);
		g.drawLine(540, 450, 590, 450);
		g.drawLine(680, 450, 730, 450);
		g.drawLine(810, 450, 860, 450);
		g.setColor(Color.yellow);
		g.drawLine(70, 450, 120, 450);
		g.drawLine(210, 450, 260, 450);
		g.drawLine(340, 450, 390, 450);
		g.drawLine(480, 450, 520, 450);
		g.drawLine(610, 450, 660, 450);
		g.drawLine(750, 450, 790, 450);
		g.drawLine(880, 450, 930, 450);

		// middle lines drawing
		// third lane
		g.setColor(Color.white);
		g.drawLine(0, 500, 50, 500);
		g.drawLine(140, 500, 190, 500);
		g.drawLine(280, 500, 320, 500);
		g.drawLine(410, 500, 460, 500);
		g.drawLine(540, 500, 590, 500);
		g.drawLine(680, 500, 730, 500);
		g.drawLine(810, 500, 860, 500);
		g.setColor(Color.yellow);
		g.drawLine(70, 500, 120, 500);
		g.drawLine(210, 500, 260, 500);
		g.drawLine(340, 500, 390, 500);
		g.drawLine(480, 500, 520, 500);
		g.drawLine(610, 500, 660, 500);
		g.drawLine(750, 500, 790, 500);
		g.drawLine(880, 500, 930, 500);
	}

}
