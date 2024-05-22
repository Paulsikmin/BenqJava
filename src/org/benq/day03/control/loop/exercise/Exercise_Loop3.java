package org.benq.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop3 {

	public static void main(String[] args) {
		//3번
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.    
		// 정수 하나 입력 : 5
		// 1+2+3+4+5=15
		Scanner scanner = new Scanner(System.in); // 사용자로부터 입력받기 위한 준비
		System.out.print("정수 입력 : ");		  // 가이드 메시지
		int input = scanner.nextInt();			  // 정수하나 입력받기 위한 명령어, 입력받은 후 input에 저장
		// 입력을 받았고 입력받은 값까지 1부터 더해야 함.
		// 누적합 -> sum 변수 선언
		// 누적합식은 sum += i
		int sum = 0;
		for(int i = 1; i <= input; i++) {	// 1부터 입력한 값까지 증가하며 반복을 해야되기 때문에
											// int i = 1; 이고 조건식의 최대값은 입력받은 값이어야 함. i는 증가(++)
			sum += i;						// 1부터 입력한 값까지 더해주는 식
			if(i != input) System.out.print(i+"+");	// +로 연결
			else System.out.print(i+"=");			// 마지막은 =으로 연결
		}
		System.out.println(sum);					// 총합 출력1
		System.out.println("총합 : " + sum);		// 총합 출력2
		System.out.println("1부터 " + input + "까지의 합 : " + sum); // 총합 출력3
		System.out.printf("1부터 %d까지의 합 : %d\n", input, sum);   // 총합 출력4
		
		// 1부터 5까지의 합 : 15
		// 총합 : 15
		
		
	}

}
