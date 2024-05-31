package org.benq.day11.oop.objectex.exercise;

public class Exam_PointEquals {

	public static void main(String[] args) {
		// Point클래스에 두점의 좌표가 같으면
		// true를 리턴하는 equals()를 작성하고
		// 2,3 포인트 객체와 2,3 포인트 객체가
		// 같은지 출력하시오.
		// 같을 때 출력 메시지
		// 좌표가 같습니다.
		// 다를 때 출력 메시지
		// 좌표가 다릅니다.
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		if(p1.equals(p2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}

}
