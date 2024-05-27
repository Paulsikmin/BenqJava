package org.benq.day04.array.practice;

import java.util.Scanner;

public class Practice_Array {
	public void practice1() {
		// 문제1
		// 길이 10, 1부터 10까지 반복문 이용
		// 배열에 넣은 후 값 출력
		int [] arrs = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arrs[i] = (i+1);
			System.out.print(arrs[i]+ "  ");
		}
//		arrs[0] = 1;
//		arrs[1] = 2;
//		arrs[2] = 3;
//		arrs[3] = 4;
//		arrs[4] = 5;
//		arrs[5] = 6;
//		arrs[6] = 7;
//		arrs[7] = 8;
//		arrs[8] = 9;
//		arrs[9] = 10;
//		for(int i = 0; i < 10; i++) {
//			System.out.print(arrs[i]+ "  ");
//			System.out.print((i+1) + " ");
//		}
	}

	public void practice2() {
		// 길이가 10인 배열,
		// 1 ~ 10까지 역순으로 배열에서 출력하기
		int [] arrs = new int[10];
//				int count = 10;
		for(int i = 0, count = 10; i < 10; i++, count--) {
			arrs[i] = count;
//					count--;
		}
		for(int i = 0; i < 10; i++) {
			arrs[i] = 10-i;
		}
//				arrs[0] = 10;
//				arrs[1] = 9;
//				arrs[2] = 8;
//				arrs[3] = 7;
//				arrs[4] = 6;
//				arrs[5] = 5;
//				arrs[6] = 4;
//				arrs[7] = 3;
//				arrs[8] = 2;
//				arrs[9] = 1;
		
		for(int i = 0; i < 10; i++) {
			System.out.print(arrs[i] + " ");
		}
//				System.out.print(arrs[0] + " ");
//				System.out.print(arrs[1] + " ");
//				System.out.print(arrs[2] + " ");
//				System.out.print(arrs[3] + " ");
//				System.out.print(arrs[4] + " ");
//				System.out.print(arrs[5] + " ");
//				System.out.print(arrs[6] + " ");
//				System.out.print(arrs[7] + " ");
//				System.out.print(arrs[8] + " ");
//				System.out.print(arrs[9] + " ");		
	}
	
	public void practice3() {
		// 사용자에게 입력받은 양의 정수만큼 배열 크기 할당
		// 1부터 입력받은 값까지 배열에 초기화 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		if(input > 0) {	// 입력받은 값이 0보다 큰지 체크
			int [] arrs = new int[input];	// 입력받은 값으로 배열 크기 할당
			for(int i = 1; i <= input; i++) {
				arrs[i-1] = i;
				System.out.print(arrs[i-1] + " ");
			}
			System.out.println();
			for(int i = 0; i < input; i++) {
				arrs[i] = i+1;
				System.out.print(arrs[i] + " ");
			}
		}		
	}
	
	public void practice4() {
		// 길이가 5인 String 배열, 
//		String [] fruits = new String[5];
//		fruits[0] = "사과";
		String [] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruits[1]);
		
		for(int i = 0; i < fruits.length; i++) {
			if(fruits[i].equals("귤")) {
				System.out.println(fruits[i]);
				break;
			}
		}		
	}
	
	public void practice5() {
		// 문자열 입력받고  문자 하나하나를 배열에 넣고
		// 검색할 문자를 입력받고
		// 해당 문자가 몇개 들어가 있고 어디에 위치하는지를 구해야 됨.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String object = sc.next();
		// 입력받은 문자열을 어떻게 문자 하나하나 배열에 넣을 것인가?
		// 그럼 그 배열은 무슨 배열이어야 하는가?
		int count = 0;
		int size = object.length();		// "문자열".length() 하면 ""안에 문자열의 길이가 구해짐. 이 경우 3이 나옴
		char [] words = new char[size]; // 만들어지는 문자배열은 입력한 문자열의 길이만큼 크기를 가져야 함.
		for(int i = 0; i < object.length(); i++) {
			words[i] = object.charAt(i);	// "문자열".charAt(0) 하면 ""안에 문자열 중 0번째에 해당하는 문자를 가져옴. 이 경우 '문'이 구해짐
		}
		System.out.print("검색할 문자 : ");
		char search = sc.next().charAt(0); // 입력한 문자열에서 무조건 첫번째 문자를 구해줌
		System.out.print(object + "에 "+search+"가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < words.length; i++) {	// 배열.length 하면 배열의 크기가 구해짐. 배열이면 다 가능 ㅎ
			if(words[i] == search) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(search + " 개수 : " + count);
//		words[0] = object.charAt(0);
//		words[1] = object.charAt(1);
//		words[2] = object.charAt(2);    // 이러한 작업을 문자열의 길이만큼 반복해야함.
//		words[3] = object.charAt(3);
//		words[4] = object.charAt(4);
//		words[5] = object.charAt(5);
		// ...?
		// 그 배열에 검색한 문자가 있는지 어떻게 처리할 것인가?
		
	}
	
	public void practice6() {
		// 요일 문자배열을 만들어서
		// 0을 입력하면 월요일, 4를 입력하면 금요일이 출력되도록하고
		// 0 ~ 6 이외에 숫자를 입력하면 잘못입력하셨습니다를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if(num < 0 || num > 6) {
			System.out.println("잘못입력하셨습니다.");
		}else {
			char [] weeks = {'월','화','수','목','금','토','일'};
			System.out.println(weeks[num]+"요일");
		}
	}
	
	public void practice7() {}
	
	public void practice8() {}
	
	public void practice9() {}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.next();
		char [] idNums = new char[idNum.length()];
		for(int i = 0; i < idNums.length; i++) {
			idNums[i] = idNum.charAt(i);
		}
		char [] copy = new char[idNums.length];
		for(int i = 0; i < idNums.length; i++) {
			//copy[i] = idNums[i];
			if(i < 8) {
				copy[i] = idNums[i];
			}else {
				copy[i] = '*';
			}
		}
		for(char num : copy) {
			System.out.print(num);
		}		
	}
	
	public void practice11() {}
	
	public void practice12() {}
}
