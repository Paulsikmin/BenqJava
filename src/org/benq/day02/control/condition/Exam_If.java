package org.benq.day02.control.condition;

import java.util.Scanner;

public class Exam_If {
	public static void main(String [] args) {
		// 제어문 - 조건문
		// 삼항연산자와 같음
		// 문법
		// if (조건식) { 실행문장; }
		
		// 예제1. 입력받은 정수가 짝수인지 홀수인지 판별하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		if (input % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
//		String result = (input % 2 == 0) ? "짝수" : "홀수";
//		System.out.println(result+"입니다.");
		
		// 예제2. 입력받은 정수가 양의 정수인지, 음의 정수인지 아니면 0인지 판별하는 프로그램을 작성하시오.
		// 삼항연산자 이용하여 작성해보기
		String result = (input == 0) ?  "0" : (input > 0) ? "양의 정수" : "음의 정수" ;
		System.out.println(result+"입니다.");
		
		// if ~ else if ~ else문
		if(input > 0) {
			System.out.println("양의 정수입니다.");
		}else if(input == 0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음의 정수입니다.");
		}
		
		if(input == 0) {
			System.out.println("0입니다.");
		}else {
			if(input > 0) {
				System.out.println("양의 정수입니다.");
			}else {
				System.out.println("음의 정수입니다.");
			}
		}
		
		if(input != 0) {
			if(input > 0) {
				System.out.println("양의 정수입니다.");
			}else {
				System.out.println("음의 정수입니다.");
			}
		}else {
			System.out.println("0입니다.");
		}
	}
}


















