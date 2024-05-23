package org.benq.day05.dimarray.exercise;

public class Exercise_DimArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
