package org.benq.day01.basic;

public class Exam_DataType {
	public static void main(String [] args) {
//		System.out.println("출력하는 코드");
//		기본형
		/*
		 * 기본형
		 * 정수, 실수, 문자, 불린형
		 * 정수 4가지(byte, short, int, long)
		 * 실수 2가지(float, double)
		 * 문자 char
		 * 불린형 boolean
		 * 
		 * 참조형
		 * 문자열 String
		 */
		// 변수 선언 및 초기화(할당)
		boolean result = true;
		char fChar = 'a';
		System.out.println(result);
		System.out.println(fChar);
		// 정수 part
		byte bNum = 127;
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 2147483648l;
		// 실수 part
		float fNum = 23.026f;
		double dNum = 23.026;
	}
}
