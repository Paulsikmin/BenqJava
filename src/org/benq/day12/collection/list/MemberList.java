package org.benq.day12.collection.list;

class Member {
	
}

public class MemberList {
	Member [] members;
	int size;
	
	public MemberList() {
		members = new Member[3];
		size = 0;
	}
	
	// 추가
	public void add(Member member) {
		members[size] = member;
		size++;
	}
	// 조회
	public Member get(int index) {
		return members[index];
		// return members; // Member []
	}
	// 크기
	public int size() {
		return size;
	}
	// 전체삭제
	public void clear() {
		members = new Member[5];
		size = 0;
	}
}
















