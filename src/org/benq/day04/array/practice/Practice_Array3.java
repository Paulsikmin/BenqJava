package org.benq.day04.array.practice;

import java.util.Scanner;

public class Practice_Array3 {

	public static void main(String[] args) {
		// 사용자에게 입력받은 양의 정수만큼 배열 크기 할당
		// 1부터 입력받은 값까지 배열에 초기화 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		if(input > 0) {	// 입력받은 값이 0보다 큰지 체크
			int [] arrs = new int[input];	// 입력받은 값으로 배열 크기 할당
			for(int i = 1; i <= input; i++) {
				arrs[i-1] = i;
				System.out.print(arrs[i-1] + " ");
			}
			System.out.println();
			for(int i = 0; i < input; i++) {
				arrs[i] = i+1;
				System.out.print(arrs[i] + " ");
			}
		}
		
	}

}
