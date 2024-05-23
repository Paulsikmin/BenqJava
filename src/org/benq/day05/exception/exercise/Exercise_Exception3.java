package org.benq.day05.exception.exercise;

public class Exercise_Exception3 {

	public static void main(String[] args) {
		// 문제3
//		배열의 인덱스가 범위를 벗어날 때 
//		발생하는 ArrayIndexOutOfBoundsException을 
//		처리하는 프로그램을 작성하시오.
		int [] intArrs = new int[5];
		try {
			System.out.println(intArrs[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
//			e.printStackTrace();
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}

}
