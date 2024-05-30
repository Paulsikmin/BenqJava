package org.benq.day10.oop.abstractex;

class Line extends Shape{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
	}
}

// 추상클래스
// 그냥 클래스
public abstract class Shape {
	String name;
	
	public Shape() {}
	
	public void paint() {}	// 일반메소드
	public abstract void draw(); 	// 추상메소드(몸체({})없음), 있으면 반드시 추상클래스
									// only be defined by an abstract class
}
