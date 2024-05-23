package org.benq.day05.dimarray.exercise;

public class Exercise_DimArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 3 4 5
		// arrs[0][0] arrs[0][1] arrs[0][2] arrs[0][3] arrs[0][4]
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		
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

}















