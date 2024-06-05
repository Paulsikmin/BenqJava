package org.benq.day13.collection.music.controller;

import java.util.List;

import org.benq.day13.collection.music.model.ManageMusic;
import org.benq.day13.collection.music.model.Music;
import org.benq.day13.collection.music.view.ViewMusic;

public class MusicApp {
	public static void main(String [] args) {
		ViewMusic view = new ViewMusic();
		ManageMusic mng = new ManageMusic();
		finish :
		while(true) {
			int choice = view.printMenu();
			Music music = null;
			List<Music> mList = null;
			String name = "";
			int index = 0;
			switch(choice) {
				case 1 : 
					music = view.inputMusic();
					mng.registerMusic(music);
					break;
				case 2 : 
					music = view.inputMusic();
					mng.registerMusicAtFirst(music);
					break;
				case 3 : 
					mList = mng.getAllMusics();
					if(mList.size() > 0) {
						view.printMusicInfo(mList);
					}else {
						view.printMsg("정보가 존재하지 않습니다.");
					}
					break;
				case 4 : 
					// 곡을 입력 받음
					name = view.inputTitle("검색");
					// mList에서 찾아서
					music = mng.searchMusicByTitle(name);
					// View를 이용하여 출력
					if(music != null) {
						view.printMusicInfo(music);
					}else {
						view.printMsg("검색 결과가 없습니다.");
					}
					break;
				case 5 : 
					// 수정할 곡명 입력
					name = view.inputTitle("수정");
					// 수정할 위치
					index = mng.searchIndexByName(name);
					// 수정할 정보
					music = mng.searchMusicByTitle(name);
					music = view.modifyMusic(music);
					mng.modifyMusic(index, music);
					break;
				case 6 : 
					name = view.inputTitle("삭제");
					// 수정할 위치
					music = mng.searchMusicByTitle(name);
					if(music != null) {
						index = mng.searchIndexByName(name);
						// 해당값 삭제
						mng.deleteMusic(index);
					}
					break;
				case 7 : 
					mng.sortByTitleASC();
					break;
				case 8 : 
					mng.sortByTitleDESC();
					break;
				case 9 : 
					mng.sortBySingerASC();
					break;
				case 10 : 
					mng.sortBySingerDESC();
					break;
				case 0 : 
					view.printMsg("프로그램을 종료합니다.");
					break finish;
				default : 
					view.printMsg("메뉴를 잘못선택하셨습니다.");
					break;
			}
		}
	}
}







