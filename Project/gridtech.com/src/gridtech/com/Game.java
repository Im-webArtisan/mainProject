package gridtech.com;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

public class Game extends Canvas implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 900, HEIGHT = WIDTH / 12 * 9;
	private Thread thread;
	boolean running = false;
	private Random r;
	private Handler handler;

	public Game() {
		// Handler has to be created before a windowcom
		handler = new Handler();
		this.addKeyListener(new KeyInput(handler));

		new Window(WIDTH, HEIGHT, "Automobile Collision Simulator", this);

		r = new Random();

		for (int i = 0; i < 10; i++) {
			handler.addObject(new Car(0, 360, ID.Car));
            handler.addObject(new Car1(0, 110, ID.Car));
            handler.addObject(new Car2(0, 410, ID.Car));
            handler.addObject(new Car3(0, 460, ID.Car));
            handler.addObject(new Car4(0, 510, ID.Car));
            handler.addObject(new Car5(0, 160, ID.Car));
            handler.addObject(new Road(WIDTH, HEIGHT, ID.lanes));
		}
	}

	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}

	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		// this the game loop
		long lasttime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lasttime) / ns;
			lasttime = now;
			while (delta >= 1) {
				tick();
				delta--;
			}
			if (running)
				render();
			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				// System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
		stop();
	}

	private void tick() {
		handler.tick();
	}

	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(2);
			return;
		}

		Graphics g = bs.getDrawGraphics();

		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);

		handler.render(g);

		g.dispose();
		bs.show();

	}

	public static int clamp(int var, int min, int max) {
		if (var >= max) {
			return var = max;
		} else if (var <= min) {
			return var = min;
		} else {
			return var;
		}
	}

	public static void main(String[] args) {
		new Game();

	}

}