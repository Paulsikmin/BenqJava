package org.benq.day05.dimarray;

public class Exam_DimArray {
	public static void main(String[] args) {
		int num = 0; // 변수
		int [] nums = new int[10]; // 배열
		int [][] dimNums = new int[2][5]; // 2차원 배열
		System.out.println("행의 길이 : " + dimNums.length);
		System.out.println("열의 길이 : " + dimNums[0].length);
		
		int [][] arrs = new int[4][4];
		int k = 1;
		// 2차원 배열 값 입력하기
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// for-each로 출력
		for(int [] arr : arrs) {
			for(int j : arr) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
//		arrs[0][0] = 1;
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[0][3] = 4;
//		arrs[1][0] = 5;
//		arrs[1][1] = 6;
//		arrs[1][2] = 7;
//		arrs[1][3] = 8;
//		arrs[2][0] = 9;
//		arrs[2][1] = 10;
//		arrs[2][2] = 11;
//		arrs[2][3] = 12;
//		arrs[3][0] = 13;
//		arrs[3][1] = 14;
//		arrs[3][2] = 15;
//		arrs[3][3] = 16;
 	}
}







