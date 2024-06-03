package org.benq.day12.collection.list;

public class IntList {
	int [] nums;
	int size;
	
	public IntList() {
		nums = new int[3];
		size = 0;
	}
	
	public void add(int num) {
		// num = 5
		nums[size] = num;
		size++;
	}
	// 전체값을 가져올때는 매개변수 필요없음
	// 그런데 1개의 값을 가져올때는 그 위치가 필요하므로 매개변수 필요함.
	public int get(int index) {
//		return nums;		// 리턴타입 int [] <- 리턴값의 자료형
		return nums[index]; // 리턴타입 int    <- 리턴값의 자료형
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		// 1. for문 돌면서 초기화
		// 2. 배열 자체 초기화
		nums = new int[3];
		size = 0;
	}
}


















