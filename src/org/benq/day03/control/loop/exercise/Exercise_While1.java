package org.benq.day03.control.loop.exercise;

public class Exercise_While1 {
	public static void main(String[] args) {
		// While문을 이용하여 1 ~ 100사이의 홀수의 합을 출력하시오
		// 1 ~ 100 사이의 홀수의 합 : ?
		int i = 1;
		int sum = 0;
		// 합 시작
		// 네번째 방법
		i = 0;
		while (i < 50) {
			sum += (2 * i) + 1;
			i++;
		}
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);
		// 첫번째 방법
		i = 0;
		sum = 0;
		while (++i < 100) {
			if (i % 2 == 1)
				sum += i;
		}
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);
		// 두번째 방법
		i = 1;
		sum = 0;
		while (i < 100) {
			sum += i;
			i += 2;
		}
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);
		// 세번째 방법
		sum = 0;
		i = 1;
		while (i <= 100) {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		// 합 끝
		// 합 출력
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);
	}
}
