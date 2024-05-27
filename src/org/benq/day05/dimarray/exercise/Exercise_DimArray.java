package org.benq.day05.dimarray.exercise;

public class Exercise_DimArray {
	
	public void practice1() {
		// 5 4 3 2 1
		// arrs[0][4] arrs[0][3] arrs[0][2] arrs[0][1] arrs[0][0]
		// 10 9 8 7 6
		// arrs[1][4] arrs[1][3] arrs[1][2] arrs[1][1] arrs[1][0]
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= 0; j--) {
				arrs[i][j] = k;
				//k++;
			}
		}
		for(int [] arr : arrs) {
			for(int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}
	
	public void practice2() {
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21
		// arrs[4][0] arrs[3][0] arrs[2][0] arrs[1][0] arrs[0][0]
		// arrs[4][1] arrs[3][1] arrs[2][1] arrs[1][1] arrs[0][0]
		int arrs [][] = new int[5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= 0; j--) {
				arrs[j][i] = k++;
			}
		}
		
		for(int arr [] : arrs) {
			for(int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}

	public void practice3() {
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arrs[j][i] = k++;
			}
		}
		for(int [] arr : arrs) {
			for(int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}		
	}

	public void practice4() {
		// 1 2 3 4 5
		// arrs[0][0] arrs[0][1] arrs[0][2] arrs[0][3] arrs[0][4] - 열증가
		// 10 9 8 7 6
		// arrs[1][4] arrs[1][3] arrs[1][2] arrs[1][1] arrs[1][0] - 열감소
		// 11 12 13 14 15
		// arrs[2][0] arrs[2][1] arrs[2][2] arrs[2][3] arrs[2][4] - 열증가
		// 20 19 18 17 16
		// arrs[3][0] arrs[3][1] arrs[3][2] arrs[3][3] arrs[3][4] - 열감소
		// 21 22 23 24 25
		// arrs[4][0] arrs[4][1] arrs[4][2] arrs[4][3] arrs[4][4] - 열증가
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < 5; j++) {
					arrs[i][j] = k++;
				}
			}else {
				for(int j = 4; j >= 0; j--) {
					arrs[i][j] = k++;
				}
			}
		}
		for(int [] arr : arrs) {
			for(int num : arr) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}		
	}
}
