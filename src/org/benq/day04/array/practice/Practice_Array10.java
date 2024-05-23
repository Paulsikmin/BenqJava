package org.benq.day04.array.practice;

import java.util.Scanner;

public class Practice_Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
