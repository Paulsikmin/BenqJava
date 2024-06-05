package org.benq.day12.collection.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageStudent implements ManageInterface {
	
	private List<Student> sList;
	
	public ManageStudent() {
		sList = new ArrayList<Student>();
	}

	@Override
	public void registerStudent(Student student) {
		sList.add(student);
	}

	@Override
		public void modifyStudent(int index, Student student) {
	//		sList.add(student);
			sList.set(index, student);
		}

	@Override
	public void deleteStudent(int index) {
		sList.remove(index);
	}

	@Override
		public List<Student> selectAllStudents() {
	//		if(sList.isEmpty()) {
	//			return null;
	//		}
			return sList;
		}

	@Override
	public List<Student> searchListByName(String name) {
		// TODO Auto-generated method stub
		if(name != null) {
			List<Student> searchList = new ArrayList<Student>();
			for(Student std : sList) {
				if(name.equals(std.getName())) {
					// 찾았다!!
					searchList.add(std);
				}
			}
			return searchList;
		}
		return null;
	}
	
	public Student searchOneByName(String name) {
		// TODO Auto-generated method stub
		if(name != null) {
			for(Student std : sList) {
				if(name.equals(std.getName())) {
					// 찾았다!!
					return std;
				}
			}
		}
		return null;
	}

	public Map<String, Object> searchModifyStudent(String name) {
		if(name != null) {
			Map<String, Object> result 
						= new HashMap<String, Object>();
			for(int i = 0; i < sList.size(); i++) { // 전체에서
				Student student = sList.get(i);
				if(name.equals(student.getName())) { // 이름이 같으면
					result.put("student", student);
					result.put("index", i);
					return result;
				}
			}
		}
		return null;
	}

	public int searchIndexByName(String name) {
		if(name != null) {
//			for(int i = 0; i < sList.size(); i++) {
//				if() return i;
//			}
			int count = 0;
			for(Student student : sList) {	// sList에서
				if(name.equals(student.getName())) { // 이름 같으면
					return count;
				}
				count++;
			}
		}
		return 0;
	}

}













