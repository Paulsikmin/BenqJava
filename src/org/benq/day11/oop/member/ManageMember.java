package org.benq.day11.oop.member;

public class ManageMember {
	
	Member [] members;
	int index;
	
	// 필드 초기화를 생성자에서
	public ManageMember() {
		members = new Member[5];
		index = 0;
	}

	// 회원정보저장
	public void insertMember(Member member) {
		if(index < members.length) {
			members[index] = member;
			index++;
		}
	}

	public void updateMember(Member member) {
		// TODO Auto-generated method stub
		int i = 0;
		for(Member mOrigin : members) {
			if(mOrigin != null) {
				String memberEmail = mOrigin.getMemberEmail();
				if(memberEmail.equals(member.getMemberEmail())) {
//					mOrigin.setMemberAddress(member.getMemberAddress());
//					mOrigin.setMemberName(member.getMemberName());
//					mOrigin.setMemberPhone(member.getMemberPhone());
					members[i] = member;
				}
			}
			i++;
		}
	}

	public void deleteAllMembers() {
			// 다지운다는건 비우는것, 배열을 비운다
			// 어떻게 비울까? 배열을 어떻게 비울까?
			// 초기상태로 만들기
			members = new Member[5];
			index = 0;
	//		for(Member member : members) {
	//			member = null;
	//		}
			
		}

	// 이메일로 회원 검색
	public Member searchOneByEmail(String email) {
		for(Member member : members) {
			if(member != null 
					&& email.equals(member.getMemberEmail()) ) {
				return member;
			}
		}
		return null;
	}

	// 회원 전체정보
	public Member [] getAllMembers() {
		return members;
	}

}



















