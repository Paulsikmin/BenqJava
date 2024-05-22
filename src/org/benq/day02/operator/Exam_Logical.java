package org.benq.day02.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		// 논리연산자 예제
		// 남자이면서 평균평점 4.3이상인 사람 -> and
		// 컴퓨공학과 또는 경영학과인 사람    -> or
		boolean result1, result2, result3, result4;
//		boolean result2;
//		boolean result3;
//		boolean result4;
		// AND -> &&, OR -> ||
		int num1 = 50;
		int num2 = 30;
		result1 = (num1 == num2) && (num1 < num2);
		result2 = (num1 < num2) || (num1 == num2);
		result3 = (num1 > num2) && (num1 != num2);
		result4 = (num1 > num2) || (num1 == num2);
		System.out.println("결과값1 : " + result1);
		System.out.println("결과값2 : " + result2);
		System.out.println("결과값3 : " + result3);
		System.out.println("결과값4 : " + result4);
		
		// 문제2
		// a는 70, b는 55다.
		// a : 70, b : 55
		// result1 = (a == b) || (a++ < 100);
		// a : 71, b : 55, result1 : true
		// result2 = (a < b) && (--b < 55); // and의 경우 앞의 결과가 false면 뒤는 연산X
		// a : 71, b : 55, result2 : false
		// result3 = (a != b) && (b-- < a++);
		// a : 72, b : 54, result3 : true
		// result4 = (a++ != b) || (b++ >= 85); // or의 경우 앞의 결과 true면 뒤는 연산X
		// a : 73, b : 54
		// result1 : true, result2 : false, result3 : true, result4 : true
		int a = 70;
		int b = 55;
		result1 = (a == b) || (a++ < 100);
		result2 = (a < b) && (--b < 55);
		result3 = (a != b) && (b-- < a++);
		result4 = (a++ != b) || (b++ >= 85);
		System.out.println("a : " + a + ", b : " + b);
		System.out.println("result1 : " + result1 + ", result2 : " + result2 
									+ ", result3 : " + result3 + ", result4 : " + result4);
		
		
		
		
		
	}
}
