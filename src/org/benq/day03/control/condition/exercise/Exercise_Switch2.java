package org.benq.day03.control.condition.exercise;

import java.util.Scanner;

public class Exercise_Switch2 {
	public static void main(String [] args) {
		// 문제3
		// 점수를 입력받아 등급을 알려주는 프로그램을 작성하세요
		// 점수를 입력해주세요 : 92
		// 학점은 A입니다.
		// 단, 점수는 0 ~ 100 사이의 수를 입력하도록 함.
		// 점수를 입력해주세요 : 102
		// 0 ~ 100 사이의 수를 입력해주세요
		// 커트라인 ( 90 ~ 100 : A, 89 ~ 80 : B, 
		// 79 ~ 70 : C, 69 ~ 60 : D, 그 외 F
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		switch(score/10) {
			case 10 :
				System.out.println("학점은 A입니다.");
				break;
			case 9 :
				System.out.println("학점은 A입니다.");
				break;
			case 8 :
				System.out.println("학점은 B입니다.");
				break;
			case 7 :
				System.out.println("학점은 C입니다.");
				break;
			case 6 :
				System.out.println("학점은 D입니다.");
				break;
			default : 
				System.out.println("학점은 F입니다.");
		}
	}
}










