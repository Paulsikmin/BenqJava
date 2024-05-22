package org.benq.day02.operator;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String [] args) {
		// 삼항연산자
		// (조건식) ? 참일때 : 거짓일때
		/*
		 * - 조건식은 반드시 true/false로 반환
		 * - 비교/논리연산자 주로 사용
		 */
		
		// 예제1. 정수를 입력받아 짝수인지 홀수인지 판별하는 프로그램을 작성하시오.
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = scanner.nextInt();
		// input % 2 != 0
		String result = (input % 2 == 0) ? "짝수" : "홀수";
		System.out.print(result+"입니다.");
	}
}
