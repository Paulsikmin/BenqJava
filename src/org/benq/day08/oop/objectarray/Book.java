package org.benq.day08.oop.objectarray;

public class Book {
	// 제목
	// 저자
	public String title;
	public String author;
	
	public Book() {}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public String toString() {
		return "("+this.title+","+this.author+")";
	}
}






