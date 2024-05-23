package org.benq.day05.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_Exception {
	public static void main(String [] args) {
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고
		// 다시 입력 받는 프로그램을 작성하여라.
		Scanner sc = new Scanner(System.in);
//		while(true) {}
//		for(;;) {}
		while(true) {
			int result = 0;
			int num1 = 0, num2 = 0;
			try {
				System.out.print("첫번째 정수 입력 : ");
				num1 = sc.nextInt();
				System.out.print("두번째 정수 입력 : ");
				num2 = sc.nextInt();
				result = num1 / num2;
			}catch(ArithmeticException e) {
//				e.printStackTrace();
				System.out.println("0으로 나눌 수 없습니다.");
				continue;	// 중요**
			}catch(InputMismatchException e) {
				System.out.println("문자를 입력하셨습니다.");
				sc.next();
				continue;
			}
			System.out.printf("%d을 %d로 나누면 몫은 %d입니다.\n", num1, num2, result);
		}
		
	}
}
