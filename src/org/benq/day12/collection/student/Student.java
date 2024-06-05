package org.benq.day12.collection.student;

public class Student {
	// 이름
	// 점수1
	// 점수2
	private String name;
	private int firstScore;
	private int secondScore;
	
	public Student() {}
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFirstScore() {
		return firstScore;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public int getSecondScore() {
		return secondScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", firstScore=" + firstScore + ", secondScore=" + secondScore + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (this.name+this.firstScore+this.secondScore).hashCode();
//		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student std = (Student)obj;
			return this.hashCode() == std.hashCode();
//			if(name.equals(std.getName())
//					&& firstScore == std.getFirstScore()
//					&& secondScore == std.getSecondScore()) {
//				return true;
//			}else {
//				return false;
//			}
		}else {
			return false;
		}
//		return super.equals(obj);
	}
}


















