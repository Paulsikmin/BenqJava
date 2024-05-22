package org.benq.day04.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {

	public static void main(String[] args) {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를
		// 입력받고 평균을 구하는 프로그램을 작성하라.
		// 단, 배열의 크기는 5이다.	
		// 정수 입력 : 24
		// 정수 입력 : 10
		// 정수 입력 : 23
		// 정수 입력 : 5
		// 정수 입력 : 7
		// 평균 : 13.8
		int [] nums = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		// 정수 입력 5번하는데 배열에 저장하시고
		for(int i = 0; i < nums.length; i++) {
			System.out.print("정수 하나 입력 : ");
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		// 배열에 있는 값을 꺼내서 더한 후 평균 구해서 출력
//		for(int i = 0; i < nums.length; i++) {
////			sum = sum + nums[i];
//			sum += nums[i];
//		}
//		sum = nums[0];
//		sum = nums[0]+nums[1];
//		sum = nums[0]+nums[1]+nums[2];
//		sum = nums[0]+nums[1]+nums[2]+nums[3];
//		sum = nums[0]+nums[1]+nums[2]+nums[3]+nums[4];
		System.out.println("평균 : " + (double)sum/nums.length); // 둘 중 하나만 해도 됨
														 // 자동 형변환되기 때문임.
		
		// 배열없이 가능 ㅇㅇ
		// 배열을 사용해서 해보셔라..
		
	}

}
