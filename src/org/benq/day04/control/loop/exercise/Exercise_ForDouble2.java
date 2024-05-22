package org.benq.day04.control.loop.exercise;

public class Exercise_ForDouble2 {
	public static void main(String [] args) {
		// 0시 0분부터 23시 59분까지 출력하기
		// 0시 0분
		// 0시 1분
		// 0시 2분
		// ..
		// 23시 57분
		// 23시 58분
		// 23시 59분
		// 분 - 0 ~ 59
		// 시 - 0 ~ 23
		for(int i = 0; i < 24; i++) {
//			System.out.println(i+"시");
			for(int j = 0; j < 60; j++) {
				System.out.println(i+"시 "+ j+"분");
			}
		}
		
	}
}
