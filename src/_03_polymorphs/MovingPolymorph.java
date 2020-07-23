package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingPolymorph extends Polymorph {

	protected int width = 50;
	protected int height = 50;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	MovingPolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLACK);
		g.fillRect(x, y, width, height);
	}
	public void update() {
		Random r = new Random();
		int randNum = r.nextInt(500);
		int randNum2 = r.nextInt(500);
		setX(randNum);
		setY(randNum2);
	}

}
