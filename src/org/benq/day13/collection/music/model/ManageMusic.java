package org.benq.day13.collection.music.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManageMusic {
	
	private List<Music> mList;
	
	public ManageMusic() {
		mList = new ArrayList<Music>();
	}
	// 맨뒤에 곡 추가
	public void registerMusic(Music music) {
		mList.add(music);
	}
	// 맨앞에 곡 추가
	public void registerMusicAtFirst(Music music) {
		mList.add(0, music);
	}
	// 곡 정보 수정
	public void modifyMusic(int index, Music music) {
		mList.set(index, music);
	}
	// 곡 삭제
	public void deleteMusic(int index) {
		mList.remove(index);
	}
	// 모든 곡 조회
	public List<Music> getAllMusics() {
		return mList;
	}
	// 곡명으로 검색
	public Music searchMusicByTitle(String name) {
		if(name != "" && name != null) {
			for(Music music : mList) {
				if(name.equals(music.getTitle())) {
					return music;
				}
			}
		}
		return null;
	}
	// 곡명으로 인덱스 검색
	public int searchIndexByName(String name) {
		if(name != "" && name != null) {
			int index = 0;
			for(Music music : mList) {
				if(name.equals(music.getTitle())) {
					return index;
				}
				index++;
			}
		}
		return 0;
	}
	public void sortByTitleASC() {
//		List<String> strList = new ArrayList<String>();
//		strList.add("김만우");
//		strList.add("강진형");
//		strList.add("박은진");
//		Collections.sort(strList); // 기본 오름차순 정렬
		// 숫자 > 영어 > 한글
		Collections.sort(mList);
		// collection - list, set, map 크기 - size()
//		int nums [] = {4, 3, 2, 1};
//		for(int i = 0; i < mList.size()-1; i++) {
//			for(int j = 0; j < (mList.size()-1)-i; j++) {
//				// 버블 정렬의 특징 - 오른쪽부터 정렬됨, 비교횟수 줄어듬
//				Music mOne = mList.get(j);
//				Music mTwo = mList.get(j+1);
//				// 문제점 : 객체비교는 부등호로는 무리
//				// 비교해야 하는 것은 곡명(title)
//				// title을 서로 비교하여 늦은 순서인 경우 교체
//				// 문자열 비교는 equals()
//				// 비교했을 때 왼쪽이 크면 맨 오른쪽으로 보내라 -> 오른쪽 큰놈들만 쌓임 -> 오름차순 정렬
//				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
////					Music temp = mOne;
////					mOne = mTwo;
////					mTwo = temp;
//					mList.set(j, mTwo);
//					mList.set(j+1, mOne);
//				}
//			}
//		}
//		for(int num : nums) {
//			System.out.print(num + " ");
//		}
//		System.out.println();
	}
	public void sortByTitleDESC() {
		Collections.sort(mList, new DescTitle());
//		for(int i = 0; i < mList.size()-1; i++) {
//			for(int j = 0; j < (mList.size()-1)-i; j++) {
//				// 버블 정렬의 특징 - 오른쪽부터 정렬됨, 비교횟수 줄어듬
//				Music mOne = mList.get(j);
//				Music mTwo = mList.get(j+1);
//				// 문제점 : 객체비교는 부등호로는 무리
//				// 비교해야 하는 것은 곡명(title)
//				// title을 서로 비교하여 늦은 순서인 경우 교체
//				// 문자열 비교는 equals()
//				// 비교했을 때 왼쪽이 작으면 맨 오른쪽으로 보내라 -> 작은 놈들만 쌓임 -> 내림차순 정렬
//				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 0) {
////					Music temp = mOne;
////					mOne = mTwo;
////					mTwo = temp;
//					mList.set(j, mTwo);
//					mList.set(j+1, mOne);
//				}
//			}
//		}
	}
	public void sortBySingerASC() {
		// TODO Auto-generated method stub
		for(int i = 1; i < mList.size(); i++) {
			for(int j = i; j >= 1; j--) {
				// 버블 정렬의 특징 - 오른쪽부터 정렬됨, 비교횟수 줄어듬
				Music mOne = mList.get(j-1);
				Music mTwo = mList.get(j);
				// 문제점 : 객체비교는 부등호로는 무리
				// 비교해야 하는 것은 곡명(title)
				// title을 서로 비교하여 늦은 순서인 경우 교체
				// 문자열 비교는 equals()
				// 비교했을 때 왼쪽이 작으면 맨 오른쪽으로 보내라 -> 작은 놈들만 쌓임 -> 내림차순 정렬
				if(mOne.getSinger().compareTo(mTwo.getSinger()) > 0) {
//					Music temp = mOne;
//					mOne = mTwo;
//					mTwo = temp;
					mList.set(j-1, mTwo);
					mList.set(j, mOne);
				}
			}
		}
	}
	public void sortBySingerDESC() {
		// TODO Auto-generated method stub
		for(int i = 1; i < mList.size(); i++) {
			for(int j = i; j >= 1; j--) {
				// 버블 정렬의 특징 - 오른쪽부터 정렬됨, 비교횟수 줄어듬
				Music mOne = mList.get(j-1);
				Music mTwo = mList.get(j);
				// 문제점 : 객체비교는 부등호로는 무리
				// 비교해야 하는 것은 곡명(title)
				// title을 서로 비교하여 늦은 순서인 경우 교체
				// 문자열 비교는 equals()
				// 비교했을 때 왼쪽이 작으면 맨 오른쪽으로 보내라 -> 작은 놈들만 쌓임 -> 내림차순 정렬
				if(mOne.getSinger().compareTo(mTwo.getSinger()) < 0) {
//					Music temp = mOne;
//					mOne = mTwo;
//					mTwo = temp;
					mList.set(j-1, mTwo);
					mList.set(j, mOne);
				}
			}
		}
	}

}































