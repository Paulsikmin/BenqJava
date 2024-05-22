package org.benq.day04.array;

public class Exam_Array {

	public static void main(String[] args) {
		int num; // 변수의 선언
		num = 1; // 변수의 초기화
		
		int [] nums;// 배열의 선언, 참조변수(주소값)
		nums = new int[10]; // 배열의 생성(할당)
		nums[0] = 1;// 배열의 초기화

		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
		System.out.println(nums[6]);
		System.out.println(nums[7]);
		System.out.println(nums[8]);
		System.out.println(nums[9]);
		System.out.println(nums.length);
//		System.out.println(nums[10]);
		
		for(int i = 0; i < 10; i++) {
			System.out.println(nums[i]);
		}
	}

}
