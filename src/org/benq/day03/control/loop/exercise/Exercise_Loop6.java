package org.benq.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop6 {

	public static void main(String[] args) {
		//6번  
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		// 단을 입력하세요 : 5
		// 5단부터 9단까지 출력
		// 단을 입력하세요 : 10
		// 9 이하의 숫자만 입력해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();
		for(int i = 2; i < 10; i++) {
//			System.out.println("2 * " + i + " = " + 2*i);
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		
	}

}










