package org.benq.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String[] args) {
		// While문을 이용하여 -1이 입력될때까지 
		// 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오.
		// 값 : 1
		// 값 : 2
		// 값 : -1
		// 합 : 3
		Scanner sc = new Scanner(System.in);
//		정수를 10번 입력받아서 합을 출력하는 프로그램부터
//		만들어보자.
		int i = 0;
		int sum = 0;
		
		int val1 = 0;
		
		while(val1 >= 0) {
			System.out.print("정수 하나 입력 : ");
			val1 = sc.nextInt();
			if(val1 == -1) break;
			sum += val1;
		}
		System.out.println("총합 : " + sum);
		////////////////////////////////////////////
		sum = 0;
		int lastNum;
		System.out.print("정수 하나 입력 : ");
		while((lastNum = sc.nextInt()) != -1) {
			sum += lastNum;
		}
		System.out.println("총합 : " + sum);
		////////////////////////////////////////////
		sum = 0;
		int val;
		while(true) {
			System.out.print("정수 하나 입력 : ");
			val = sc.nextInt();
			if(val == -1) break;
			sum += val;
		}
		System.out.println("총합 : " + sum);
		////////////////////////////////////////////
		sum = 0;
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		while(input != -1) {
			sum += input;
			System.out.print("정수 하나 입력 : ");
			input = sc.nextInt();
		}
		System.out.println("총합 : " + sum);
		//////////////////////////////////////////////
		sum = 0;
		while(i < 10) {
			System.out.print("정수 하나 입력 : ");
			int num = sc.nextInt();
			if(num == -1) break;
			sum += num;
			i++;
		}
		System.out.println("총합 : " + sum);
	}
}
