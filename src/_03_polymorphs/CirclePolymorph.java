package _03_polymorphs;

import java.awt.Graphics;

public class CirclePolymorph extends Polymorph {
	
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
	
	CirclePolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
