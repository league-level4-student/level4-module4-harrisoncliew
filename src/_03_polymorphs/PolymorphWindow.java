package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;
	public int mouseX;
	public int mouseY;

	ArrayList<Polymorph> polymorphs;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.addMouseMotionListener(this);
		window.addMouseListener(this);
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		polymorphs = new ArrayList<Polymorph>();
		polymorphs.add(new BluePolymorph(100, 100));
		polymorphs.add(new RedPolymorph(50, 50));
		polymorphs.add(new MovingPolymorph(50, 50));
		polymorphs.add(new MousePolymorph(200, 200));
		polymorphs.add(new MessagePolymorph(250,250));

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for (Polymorph polymorph : polymorphs) {
			polymorph.draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph polymorph : polymorphs) {
			if (polymorph instanceof MovingPolymorph) {
				polymorph.update();
			}

		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();
		for (Polymorph polymorph : polymorphs) {
			if (polymorph instanceof MousePolymorph) {
				polymorph.setX(mouseX);
				polymorph.setY(mouseY);
			}

		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		for (Polymorph polymorph : polymorphs) {
			if (polymorph instanceof MessagePolymorph) {
				if (e.getX() > polymorph.getX() && e.getX() < polymorph.getX() + 50 && e.getY() > polymorph.getY()
						&& e.getY() < polymorph.getY() + 50) {
					JOptionPane.showMessageDialog(null, "Hooray!! You have clicked me!!");

				}
			}

		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
