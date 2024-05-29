package org.benq.day09.oop.overriding;

public class Line extends Shape{
	// @Override // 어노테이션 생략 가능
	public void draw() {
		System.out.println("Line");
	}
}
