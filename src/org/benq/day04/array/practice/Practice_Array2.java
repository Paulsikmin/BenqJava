package org.benq.day04.array.practice;

public class Practice_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 길이가 10인 배열,
		// 1 ~ 10까지 역순으로 배열에서 출력하기
		int [] arrs = new int[10];
//		int count = 10;
		for(int i = 0, count = 10; i < 10; i++, count--) {
			arrs[i] = count;
//			count--;
		}
		for(int i = 0; i < 10; i++) {
			arrs[i] = 10-i;
		}
//		arrs[0] = 10;
//		arrs[1] = 9;
//		arrs[2] = 8;
//		arrs[3] = 7;
//		arrs[4] = 6;
//		arrs[5] = 5;
//		arrs[6] = 4;
//		arrs[7] = 3;
//		arrs[8] = 2;
//		arrs[9] = 1;
		
		for(int i = 0; i < 10; i++) {
			System.out.print(arrs[i] + " ");
		}
//		System.out.print(arrs[0] + " ");
//		System.out.print(arrs[1] + " ");
//		System.out.print(arrs[2] + " ");
//		System.out.print(arrs[3] + " ");
//		System.out.print(arrs[4] + " ");
//		System.out.print(arrs[5] + " ");
//		System.out.print(arrs[6] + " ");
//		System.out.print(arrs[7] + " ");
//		System.out.print(arrs[8] + " ");
//		System.out.print(arrs[9] + " ");
	}

}
