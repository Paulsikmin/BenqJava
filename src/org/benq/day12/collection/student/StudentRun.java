package org.benq.day12.collection.student;

import java.util.List;
import java.util.Map;

public class StudentRun {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManageStudent mng = new ManageStudent();
		ViewStudent view = new ViewStudent();
		끝 :
		while(true) {
			int input = view.printMenu();
			switch(input) {
			case 1 :
				Student std = view.inputStudent();
				mng.registerStudent(std);
				break;
			case 2 : 
				String name = view.inputName("검색");
				List<Student> sList = mng.searchListByName(name);
				view.displayStudents(sList);
				break;
			case 3 : 
				List<Student> stdList = mng.selectAllStudents();
//				if(stdList != null) 
//				if(!stdList.isEmpty())
				if(stdList.size() > 0) 
					view.displayStudents(stdList);
				else
					view.displayMsg("회원정보가 없습니다.");
				break;
			case 4 : 
				name = view.inputName("수정");
				
//				Student student = mng.searchModifyStudent(name);
//				student = view.modifyStudent(student);
				
//				int index = mng.searchIndexByName(name);
//				Student student = mng.searchModifyStudent(name);
				
				Map<String, Object> result = mng.searchModifyStudent(name);
				Student student 
					= view.modifyStudent((Student)result.get("student"));
				mng.modifyStudent((int)result.get("index"), student);
				break;
			case 5 : 
				name = view.inputName("삭제");
				int index = mng.searchIndexByName(name);
				mng.deleteStudent(index);
				break;
			case 6 : 
				name = view.inputName("재평가 여부를 확인");
				student = mng.searchOneByName(name);
				String passResult = checkPass(student);
				view.displayMsg(passResult);
				break;
			case 0 :
				view.displayMsg("프로그램을 종료합니다");
				break 끝;
			default : 
				view.displayMsg("메뉴를 다시 선택해주세요.");
			}
		}
	}
	// 재평가 기준 설명
	// 0. 재평가의 여부는 1차, 2차가 각각 다르다.
	// 1. 점수가 40점 미만인 경우 과락으로 재평가 대상자가 된다.
	// 2. 1차 점수와 2차 점수의 평균은 60점을 넘어야 통과한다.
	// 3. 1차 점수와 2차 점수의 평균이 60점 미만인 경우 60점 미만의
	// 과목은 재평가를 본다.
	// 1차 점수 : 60점, 2차 점수 : 60점
	// 1차 점수 : 100점, 2차 점수 : 20점(2차만 재평가)
	// 1차 점수 : 59점, 2차 점수 : 60점(1차만 재평가);
	// 결론 : 평균 60점이 넘어야함, 넘었는데 재평가보는 경우있음.
	// 평균 60점이 넘지 않으면 재평가(60점 미만만 재평가)
	
	public static String checkPass(Student student) {
		int first = student.getFirstScore();
		int second = student.getSecondScore();
		//  평균이 60점이 넘으면 통과
		//  평균이 60점이 안되면 재평가
		double avg = (first+second)/(double)2;
		if(avg >= 60) {
			if(first < 40) {
				return "1차 시험 재평가";
			}else if(second < 40) {
				return "2차 시험 재평가";
			}else {
				return "모두 통과입니다.";
			}
		}else {
			String result = "";
			if(first < 60) {
				result += "1차 시험 재평가\n";
			}
			if(second < 60) {
				result += "2차 시험 재평가";
			}
			return result;
		}
	}
}








