package org.benq.day04.array.practice;

public class Practice_Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
