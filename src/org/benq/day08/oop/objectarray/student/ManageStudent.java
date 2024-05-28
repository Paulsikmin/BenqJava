package org.benq.day08.oop.objectarray.student;

import java.util.Scanner;

public class ManageStudent {
	Student [] students = new Student[3];
	
	public Student [] printInfo() {
		return students;
	}
	
	public void inputInfo(Student [] students) {
		this.students = students;
	}
	

}
