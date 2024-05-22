package org.benq.day01.basic;

public class Exam_Constant {
	public static void main(String [] args) {
		// 변수는 소문자로 시작!
		// 상수는 모두 대문자~
		final double PI = 3.141519;
		
		// PI = 3.24; // 재할당 불가능 -> 상수(final)
		double radius = 10.2;
		radius = 5.4;
		double circleArea = radius * radius * PI;
		System.out.println("원의 면적 : " + circleArea);
	}
}
