package org.benq.day05.dimarray.exercise;

public class Exercise_DimArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
