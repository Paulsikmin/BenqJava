package org.benq.day06.array.sort;

public class Exam_InsertionSort {
	public static void main(String [] args) {
		// 삽입정렬
		// 정렬 알고리름 중에 하나, 가장 간단하고 기본이 되는 알고리즘
		// 배열의 N번 인덱스값을 n-1번에서 0번 인덱스까지 비교~!
		// N은 1부터 시작
		// {2, 5, 4, 1, 3}
		// 5자리랑 있는 값 비교
		// i = 1
		// j = 0
		// arrs[1]과 arrs[0] 비교
		// arrs[0]이 크면 교환
		// i = 2
		// j = 0, 1
		// arrs[2]와 arrs[1] 비교
		// arrs[1]이 크면 교환
		// arrs[2]와 arrs[0] 비교
		// arrs[0]이 크면 교환
		// i = 3
		// j = 0, 1, 2
		// arrs[3]과 arrs[2] 비교
		// arrs[2]가 크면 교환
		// arrs[3]과 arrs[1] 비교
		// arrs[1]이 크면 교환
		// arrs[3]과 arrs[0] 비교
		// arrs[0]이 크면 교환
		// i = 4
		// j = 0, 1, 2, 3
		// arrs[4]과 arrs[3] 비교
		// arrs[3]가 크면 교환
		// arrs[4]과 arrs[2] 비교
		// arrs[2]가 크면 교환
		// arrs[4]과 arrs[1] 비교
		// arrs[1]이 크면 교환
		// arrs[4]과 arrs[0] 비교
		// arrs[0]이 크면 교환
		
		int arrs [] = {2, 5, 4, 1, 3};
		for(int i = 1; i < arrs.length; i++) {
			for(int j = i; j >= 1; j--)
			if(arrs[j-1] > arrs[j]) { // 설명과 다르게
									  // i가 아닌 j인 이유
									  // 교환이 일어난 후 같은값으로
									  // 비교하기 위해서임.
				int temp = arrs[j];
				arrs[j] = arrs[j-1];
				arrs[j-1] = temp;
			}
		}
		// 정렬된 결과 출력
		for(int num : arrs) {
			System.out.print(num + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		// {2, 5, 4, 1, 3}
		// 첫번째 : 5와 2 비교 -> 교환 X
		// 결과 : {2, 5, 4, 1, 3}
		// 4와 비교 시작
		// 두번째 : 4와 5비교 -> 교환 
		// 			4와 2비교 -> 교환 X
		// 결과 : {2, 4, 5, 1, 3}
		// 세번째 : 1과 5비교 -> 교환
		//			1과 4비교 -> 교환
		//          1과 2비교 -> 교환
		// 결과 : {1, 2, 4, 5, 3}
		// 네번째 : 3과 5비교 -> 교환
		//			3과 4비교 -> 교환
		//          3과 2비교 -> 교환 X
		//          3과 1비교 -> 교환 X
		// 결과 : {1, 2, 3, 4, 5}
//		int arrs [] = {2, 5, 4, 1, 3};
//		for(int i = 1; i < arrs.length; i++) {
			
			// 5 하고 2 비교, i가 1일때
//			if(arrs[0] > arrs[1]) {
//				int temp = arrs[1];
//				arrs[1] = arrs[0];
//				arrs[0] = temp;
//			}
			// 4하고 5비교, 4하고 2비교, i가 2일때
//			if(arrs[1] > 4) {
//				int temp = 4;
//				4 = arrs[1];
//				arrs[1] = temp;
//			}
//			if(arrs[0] > 4) {
//				int temp = 4;
//				4 = arrs[0];
//				arrs[0] = temp;
//			}
			// 1하고 4비교, 1하고 5비교, 1하고 2비교
			// i가 3일때
//			if(arrs[2] > 1) {
//				int temp = 1;
//				1 = arrs[2];
//				arrs[2] = temp;
//			}
//			if(arrs[1] > 1) {
//				int temp = 1;
//				1 = arrs[1];
//				arrs[1] = temp;
//			}
//			if(arrs[0] > 1) {
//				int temp = 1;
//				1 = arrs[0];
//				arrs[0] = temp;
//			}
//		}
		
		
	}
}



















