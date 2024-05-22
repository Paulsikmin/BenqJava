package org.benq.day01.inputsc;

import java.util.Scanner;

public class Exam_ScannerTest {
	public static void main(String [] args) {
		//System.out.println("Test");
		Scanner sc = new Scanner(System.in);
		System.out.println("하나의 수를 입력해주세요.");
		int a = sc.nextInt();
		System.out.println("a의 값 : "+a);
	}
}
