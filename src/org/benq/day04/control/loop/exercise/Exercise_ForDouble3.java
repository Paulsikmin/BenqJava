package org.benq.day04.control.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String [] args) {
		// 2단을 세로로 출력, 그 옆에 3단 세로로 출력,
		// 그 옆에 4단 세로로 출력
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + j*i);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
