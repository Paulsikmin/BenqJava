package org.benq.day06.array.sort.exercise;

import java.util.Scanner;

public class Question1 {
	public static void main(String [] args) {
		// 1. 크기 5인 정수 배열 생성
		Scanner sc = new Scanner(System.in);
//		int length = 5;
		int [] nums = new int[5];
		// 2. 배열에 값 입력하기 5번
		for(int i = 0; i < nums.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			int num = sc.nextInt();
			nums[i] = num;
		}
		// 3. 정렬하기 - 버블정렬 알고리즘
		// 1 - 2, 2 - 3, 3 - 4, 4 - 5
		// 최대값을 맨 오른쪽에 위치하면서 정렬하는 알고리즘
		// 1 - 2, 2 - 3, 3 - 4
		// 1 - 2, 2 - 3
		// 1 - 2
		for(int i = 0; i < nums.length-1; i++) {
			for(int j = 0; j < (nums.length-1)-i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		// 4. 출력하기
		System.out.print("정렬된 결과 : ");
		for(int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
		// 5. 처음과 끝 합해서 출력하기
		System.out.print("정렬 후 첫번째 수와 마지막 수의 합 : ");
		// 문자열 + 정수 = 문자열
		// 정렬 후 첫번째 수와 마지막 수의 합 : 17
		System.out.println("정렬 후 첫번째 수와 마지막 수의 합 : "+(nums[0]+nums[4]));
	}
}


















