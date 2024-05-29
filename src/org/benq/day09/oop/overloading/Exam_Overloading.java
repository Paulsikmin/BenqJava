package org.benq.day09.oop.overloading;

class Weapon {
	String name;
	int price;
	
	public Weapon() {}
	public Weapon(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

public class Exam_Overloading {

	public static void main(String[] args) {
		/*
		 * 메소드 오버로딩
		 * 이름은 똑같으나 매개변수의 갯수나 타입이 달라야 적용됨
		 * 오버로딩이 적용되어 있는 사례 
		 * ex) System.out.println("")
		 */
		System.out.println("고마워 오버로딩!!");
		System.out.println(1023);
		System.out.println('F');
	}
	public void makesomenoise() {
		
	}
	
	public void makesomenoise(int num) {
		
	}
}






