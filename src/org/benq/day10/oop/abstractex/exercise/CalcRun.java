package org.benq.day10.oop.abstractex.exercise;

public class CalcRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add(5, 7) -> 12
		// substract(10, 23) -> -13
		// average({5, 7, 10, 23}) -> 11.25
//		Calculator calculator = new Calculator();
		Calculator calc = new GoodCalc();
//		GoodCalc goodCalc = new GoodCalc();
		System.out.println("합 : " + calc.add(5,7)); // 5 7
		System.out.println("차 : " + calc.substract(10, 23)); // 10 23
		int [] nums = {5, 7, 10, 23};
		System.out.println("평균 : " 
//			+ calc.average(new int [] {5, 7, 10, 23})); // 5 7 10 23
			+ calc.average(nums)); // 5 7 10 23
	}

}
