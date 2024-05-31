package org.benq.day11.oop.objectex.exercise;

public class Point {
	int x, y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		return x == p.x && y == p.y;
//		if(x == p.x && y == p.y) {
//			return true;
//		}else {
//			return false;
//		}
//		return super.equals(obj);
	}
}
