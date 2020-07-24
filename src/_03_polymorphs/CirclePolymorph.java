package _03_polymorphs;
import java.lang.Math;
import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph {
	
	protected int width = 5;
	protected int height = 5;
	
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
	
	CirclePolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.magenta);
		g.fillRect(x, y, width, height);
	}
	public void update() {
		double theta = 90;
		int r = 1;
		x = (int) (x+r*Math.cos(theta));
		y = (int) (y+r*Math.sin(theta));
		
		if(theta<360.0) {
			theta += 0.1;
		} else {
			theta = 0.0;
		}
		
	}

}
