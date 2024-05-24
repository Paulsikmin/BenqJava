package org.benq.day06.array.sort;

public class Exam_BubbleSort {

	public static void main(String[] args) {
		// 버블정렬이란?
		// 인접한 두개의 원소를 검사하여 정렬하는 방법.
		// 구현이 쉽다는 장점, 이미 정렬된 데이터를 정렬할 때 가장 빠름.
		// 기본적으로 다른 정렬에 비해서 속도가 느린편이며 역순으로 정렬할 때 가장 느림.
		//{ 2, 5, 4, 1, 3 }
		// {2, 5, 4, 1, 3}	1회 비교1
		// {2, 4, 5, 1, 3}	2회
		// {2, 4, 1, 5, 3}	3회
		// {2, 4, 1, 3, 5}	4회
		// 첫번째 결과 { 2, 4, 1, 3, 5 }
		// { 2, 4, 1, 3, 5 }
		// { 2, 4, 1, 3, 5 } 1회 비교2
		// { 2, 1, 4, 3, 5 } 2회
		// { 2, 1, 3, 4, 5 } 3회
		// 두번째 결과 { 2, 1, 3, 4, 5}
		// { 2, 1, 3, 4, 5 }
		// { 1, 2, 3, 4, 5 } 1회 비교3 - 정렬 끝
		// { 1, 2, 3, 4, 5 } 2회
		// 세번째 결과 { 1, 2, 3, 4, 5}
		// { 1, 2, 3, 4, 5 }
		// { 1, 2, 3, 4, 5 } 1회 비교4 - 끝
		// 네번째 결과 { 1, 2, 3, 4, 5}
		int arrs [] = { 2, 5, 4, 1, 3 };
		for(int i = 0; i < arrs.length-1; i++) {
			for(int j = 0; j < (arrs.length-1)-i; j++) {
				if(arrs[j] > arrs[j+1]) {
					int temp = arrs[j+1];
					arrs[j+1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		// 정렬된 결과 출력
		for(int num : arrs) {
			System.out.print(num + " ");
		}		
			// 비교하는 코드
//			if(arrs[0] > arrs[1]) {
//				int temp = arrs[1];
//				arrs[1] = arrs[0];
//				arrs[0] = temp;
//			}
//			if(arrs[1] > arrs[2]) {
//				int temp = arrs[2];
//				arrs[2] = arrs[1];
//				arrs[1] = temp;
//			}
//			if(arrs[2] > arrs[3]) {
//				int temp = arrs[3];
//				arrs[3] = arrs[2];
//				arrs[2] = temp;
//			}
//			if(arrs[3] > arrs[4]) {
//				int temp = arrs[4];
//				arrs[4] = arrs[3];
//				arrs[3] = temp;
//			}
//			
//			if(arrs[0] > arrs[1]) {
//				int temp = arrs[1];
//				arrs[1] = arrs[0];
//				arrs[0] = temp;
//			}
//			if(arrs[1] > arrs[2]) {
//				int temp = arrs[2];
//				arrs[2] = arrs[1];
//				arrs[1] = temp;
//			}
//			if(arrs[2] > arrs[3]) {
//				int temp = arrs[3];
//				arrs[3] = arrs[2];
//				arrs[2] = temp;
//			}
//			
//			if(arrs[0] > arrs[1]) {
//				int temp = arrs[1];
//				arrs[1] = arrs[0];
//				arrs[0] = temp;
//			}
//			if(arrs[1] > arrs[2]) {
//				int temp = arrs[2];
//				arrs[2] = arrs[1];
//				arrs[1] = temp;
//			}
//			
//			if(arrs[0] > arrs[1]) {
//				int temp = arrs[1];
//				arrs[1] = arrs[0];
//				arrs[0] = temp;
//			}
		
	}

}
















