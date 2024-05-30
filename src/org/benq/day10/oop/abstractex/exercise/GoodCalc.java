package org.benq.day10.oop.abstractex.exercise;

public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		// 배열에서 값을 꺼내서 누적합 후 배열의 크기로
		// 나눠버림
		int sum = 0;
//		for(int i = 0; i < a.length; i++) { sum += a[i] }
		for(int num : a) {
			sum += num;
		}
		double avg = (double)sum / a.length;
		return avg;
	}

}
