package org.benq.day05.random;

import java.util.Random;

public class Exam_Random {
	public static void main(String [] args) {
		
		Random rand = new Random();
//		for(int i = 0; i < 100; i++) {
		int num = rand.nextInt(10);
		System.out.print(num + " \n");
		// 25부터 35 사이의 랜덤한 수를 출력하시오
		// -25    -25
		// 0 ~ 10 + 1 -> 11
		// rand.nextInt(11) + 25 // 25 ~ 35
		// 1 또는 2 랜덤한 수를 출력하도록 하시오
		// -1     -1
		// 0 ~ 1 + 1 -> 2
		// rand.nextInt(2) + 1 // 1 ~ 2
		
		// 1 ~ 10 사이의 랜덤한 수를 구하시오
		// rand.nextInt(10) : 0 ~ 9 사이의 랜덤한 수
//		for(int i = 0; i < 100; i ++) {
//			num = rand.nextInt(10)+1; // 1 ~ 10 사이의 랜덤한 수
//			System.out.print(num + " ");
//		}
//		}
		for(int i = 0; i < 100; i++) {
//			double randNum = Math.random();
			// Random rand = new Random(); // 써야됌
			// rand.nextInt()			   // rand를 통해서 원하는 기능 사용
			// Math math = new Math(); // 안써도됌
			int randNum = (int)(Math.random()*10); // Math. 
			// 0 ~ 9 사이의 값
			// 1 ~ 10 사이의 값
			// (int)(Math.random()*10)+1
			// 25 ~ 35 사이의 값
			randNum = (int)(Math.random()*11)+25;
			// 0 ~ 10
			// +25 +25
			System.out.println(randNum);
		}
		
	}
}














