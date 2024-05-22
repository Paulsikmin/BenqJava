package org.benq.day04.array.practice;

public class Practice_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1
		// 길이 10, 1부터 10까지 반복문 이용
		// 배열에 넣은 후 값 출력
		int [] arrs = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arrs[i] = (i+1);
			System.out.print(arrs[i]+ "  ");
		}
//		arrs[0] = 1;
//		arrs[1] = 2;
//		arrs[2] = 3;
//		arrs[3] = 4;
//		arrs[4] = 5;
//		arrs[5] = 6;
//		arrs[6] = 7;
//		arrs[7] = 8;
//		arrs[8] = 9;
//		arrs[9] = 10;
//		for(int i = 0; i < 10; i++) {
//			System.out.print(arrs[i]+ "  ");
//			System.out.print((i+1) + " ");
//		}
	}

}
