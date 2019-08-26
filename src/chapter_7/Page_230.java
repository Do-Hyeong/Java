package chapter_7;

import java.awt.Frame;
import java.awt.Graphics;

class Point {
	private int x;
	private int y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

class Circle {
	private Point center;
	private int radius;
	
	public Circle() {
		this(100, 100, 100);
	}
	
	public Circle(int centerX, int centerY, int radius) {
		this.center = new Point(centerX, centerY);
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}

class DrawShape extends Frame {
	public DrawShape(String frameTitle) {
		super(frameTitle);
		setSize(300, 300);
		setVisible(true);
	}
	
	public void paint(Graphics graphics) {
		graphics.drawOval(150, 150, 50, 50);

		graphics.drawLine(100, 100, 140, 50);
		graphics.drawLine(140, 50, 200, 100);
		graphics.drawLine(200, 100, 100, 100);
	}
}

public class Page_230 {
	public static void main(String[] args) {
		new DrawShape("원 그리기");
	}
	
//	public Page_230(String frameTitle) {
//		super(frameTitle);
//		setSize(500, 500);
//		setVisible(true);
//	}
//	
//	public void paint(Graphics graphics) {
//		graphics.drawOval(200, 150, 50, 50);
//	}
}