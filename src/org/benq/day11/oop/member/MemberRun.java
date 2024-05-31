package org.benq.day11.oop.member;

public class MemberRun {
	public static void main(String [] args) {
		ViewMember view = new ViewMember();
		ManageMember mng = new ManageMember();
		exit :
		while(true) {
			int choice = view.mainMenu();
			switch(choice) {
			case 1 :
				// 회원가입
				Member member = view.inputMember();
				mng.insertMember(member); // 저장완료
				break;
			case 2 : 
				// 회원검색(이메일)
				String email = view.inputEmail("검색");
				member = mng.searchOneByEmail(email);
				if(member != null)
					view.printOneMember(member);
				else 
					view.displayMessage("검색결과가 없습니다.");
				break;
			case 3 : 
				// 회원 전체정보 출력
				Member [] members = mng.getAllMembers();
				view.printAllMembers(members);
				break;
			case 4 : 
				// 회원 정보 수정
				// 수정할 이메일 입력
				email = view.inputEmail("수정");
				// 데이터 확인
				member = mng.searchOneByEmail(email);
				if(member != null) { // 있으면
					// 객체배열에서 객체를 이용한 수정하기
					view.modifyMember(member);
					
					// 새로운 객체 만들어서 수정하기
					// 수정할 값 입력 받음
					//member = view.modifyMember(email);
					// 입력값이 완료되면 수정
					//mng.updateMember(member);
				}
				break;
			case 5 : 
				// 회원 정보 전체삭제
				mng.deleteAllMembers();
				break;
			case 6 :
				// 회원 정보 검색하여 삭제
				
				break;
			case 0 : 
				view.displayMessage("프로그램을 종료합니다.");
				break exit;
			default :
				view.displayMessage("잘못입력하셨습니다.");
			}
		}
	}
}
