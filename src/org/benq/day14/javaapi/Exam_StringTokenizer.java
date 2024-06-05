package org.benq.day14.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {

	public static void main(String[] args) {
		String query = "name=james&addr=seoul&age=22";
		String words [] = query.split("[&=]");
		for(String word : words) {
			System.out.print(word + " ");
		}
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(query, "&=");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

}
