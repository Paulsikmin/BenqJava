package org.benq.day06.array.sort.exercise;

import java.util.Scanner;

public class Exercise_Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		정상 실행 결과 예시
//		----------- 컴퓨터에게 지는 경우 -------------
//		가위 바위 보 게임을 시작합니다.
//		가위 바위 보 중 한 개를 입력하세요 : 가위
//		당신은 가위를 냈습니다.
//		컴퓨터는 바위를 냈습니다.
//		당신이 졌습니다!
        Scanner sc = new Scanner(System.in);
        
        System.out.println("가위 바위 보 게임을 시작합니다.");
        
        do {
            System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
            
            String input = sc.nextLine();
            
            System.out.println("당신은 " + input + "를 냈습니다.");
            
            int random = (int)(Math.random()*3);
            String computer = "";
            
            switch(random) {
                    case 0 : computer = "가위"; break;
                    case 1 : computer = "바위"; break;
                    case 2 : computer = "보"; break;                        
            }
    
            System.out.println("컴퓨터는 " + computer + "를 냈습니다.");
            boolean win = false;
            if(computer == input) {
                    System.out.println("비겼습니다. 다시 시작합니다.");
            }else {
                   
                    
                    if(computer.equals("가위")) {
                            if(input.equals("바위")) {
                                    win = true;
                            }
                    }else if(computer.equals("바위")) {
                            if(input.equals("보")) {
                                    win = true;
                            }
                    }else {
                            if(input.equals("가위")) {
                                    win = true;
                            }
                    }
            }
            if(win) {
                    System.out.println("당신이 이겼습니다.");
                    break;
            }else{
                    System.out.println("당신이 졌습니다.");
                    break;
            }
        }while(true);        
	}
}
