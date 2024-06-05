package org.benq.day14.javaapi;

public class Exam_String {

	public static void main(String[] args) {
		String msg = "Hello Java";			// 상수풀에 들어가서 재사용
		msg = new String("Hello Java");		// 주소 무조건 새로이 생성
		
		// 문자열 길이
		String data1 = new String(" C#");
		String data2 = new String(",C++ ");
		System.out.println(data1 + "의 길이는 " + data1.length());
		System.out.println(data2 + "의 길이는 " + data2.length());
		
		// 문자열 포함되어 있는지 체크
		System.out.println("#이 있는가? : " + data1.contains("#"));
		
		// 문자열 연결
		//  C#,C++ 
		data1 = data1.concat(data2);
		System.out.println("연결된 문자열 : " + data1);
		
		// 문자열 공백 제거
		data1 = data1.trim();
		System.out.println("공백 제거 확인 : " + data1);
		
		// 문자열 교체 C# -> JAVA
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 확인 : " + data1);
		
		// 문자열 썰기1 - 기준 잡고 썰어줌
		String [] words = data1.split(",");
		for(int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " / ");
		}
		for(String word : words) {
			System.out.print(word + " / ");
		}
		System.out.println();
		// 문자열 썰기2 - 인덱스로 썰어줌
//		data1 = data1.substring(4);
		System.out.println("문자열 자르기 : " + data1);
		data1 = data1.substring(0, 4);
		System.out.println("범위로 자르기 : " + data1);
		
		// 문자열 -> 문자로 만들기
		char word = data1.charAt(0);
		System.out.println("문자로 자르기 : " + word);
	}

}






















