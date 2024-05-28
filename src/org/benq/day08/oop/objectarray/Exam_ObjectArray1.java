package org.benq.day08.oop.objectarray;

public class Exam_ObjectArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====== 객체 생성 후 출력 ======");
		Circle donut = new Circle(10);
		System.out.println("원의 넓이 : " + donut.getArea());
		Circle pizza = new Circle(7);
		System.out.println("원의 넓이 : " + pizza.getArea());
		
		Circle [] cArrs = new Circle[5];
		cArrs[0] = donut;
		cArrs[1] = pizza;
		// Nullpointer Exception이 나지 않게 하려면
		cArrs[2] = new Circle(6);
		cArrs[3] = new Circle(8);
		cArrs[4] = new Circle(9);
		System.out.println("====== 배열 초기화 후 출력 ======");
		System.out.println(cArrs[0].getArea());
		System.out.println(cArrs[1].getArea());
		System.out.println(cArrs[2].getArea());
		System.out.println(cArrs[3].getArea());
		System.out.println(cArrs[4].getArea());
		
	}

}
