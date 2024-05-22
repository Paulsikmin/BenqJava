package org.benq.day04.array.practice;

import java.util.Scanner;

public class Practice_Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
