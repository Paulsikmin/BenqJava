package org.benq.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram2 {

	static int kor;
	static int eng;
	static int math;	// ScoreProgram2 클래스의 멤버필드
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finish :
		while(true) {
			int choice = printMenu();
			switch(choice) {
			case 1 : 
				inputScore();
				break;
			case 2 :
				printScore();
				break;
			case 3 :
				displayMsg("프로그램을 종료합니다.");
				break finish;
			default : 
				displayMsg("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
	}
	private static void displayMsg(String message) {
//		message = "프로그램을 종료합니다.";
		System.out.println(message);
	}
	// ScoreProgram2 클래스의 멤버메소드
	private static void printScore() {
		// TODO Auto-generated method stub
		System.out.println("====== 성적 출력 =======");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + (kor+eng+math));
		System.out.println("평균 : " + (kor+eng+math)/3.0);
	}

	private static void inputScore() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 ======");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		
	}

	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}

}














