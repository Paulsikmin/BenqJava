package org.benq.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If3 {
	public static void main(String[] args) {
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
//		char grade = 0; // 모델 방식으로 코딩하는 것
						// 출력하는 메소드를 줄일 수 있음.
		if(score < 0 || score > 100) {
			System.out.print("0 ~ 100 사이의 수를 입력해주세요.");
		}else {
			if(score >= 90) {
//				grade = 'A';
				System.out.println("학점은 A입니다.");
			}else if(score >= 80) {
//				grade = 'B';
				System.out.println("학점은 B입니다.");
			}else if(score >= 70) {
//				grade = 'C';
				System.out.println("학점은 C입니다.");
			}else if(score >= 60) {
//				grade = 'D';
				System.out.println("학점은 D입니다.");
			}else {
//				grade = 'F';
				System.out.println("학점은 F입니다.");
			}
		}
//		System.out.println("학점은 " + grade + "입니다.");
	}

}
