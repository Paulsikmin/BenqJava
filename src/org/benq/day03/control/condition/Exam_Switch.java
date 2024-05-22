package org.benq.day03.control.condition;

import java.util.Scanner;

public class Exam_Switch {
	public static void main(String[] args) {
		// 조건문
		// if ~ else if else와 대응되는 구문임
		// 문법
		// switch(식) {
		// 		case 값1 :
		//			실행문;
		//		break;
		// 		case 값2 :
		//			실행문;
		//		break;
		//		default :
		//			실행문;
		//	}
		
		// 예제1. 정수를 입력받아 입력한 값이 1이면 빨간색, 2면 노란색, 3이면 초록색으로 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		switch(num) {
			case 1 :
				System.out.println("빨간색");
				break;
			case 2 :
				System.out.println("노란색");
				break;
			case 3 :
				System.out.println("초록색");
				break;
			default :
				System.out.println("1 ~ 3 사이의 숫자를 입력해주세요.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
