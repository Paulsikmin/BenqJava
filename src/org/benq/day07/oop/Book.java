package org.benq.day07.oop;

public class Book {
	
	String title;
	String author;
	
	public Book() {
		this("", "");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	
	
	// 멤버필드			
	// 제목				bookTitle
	// 가격				bookPrice
	// 저자				bookAuthor
	// 카테고리			category
	// 출판사			publisher
	// 출판날짜			publishingDate
//	String title;
//	int price;
//	String author;
//	String category;
//	String publisher;
//	String publishingDate;
	
	// 멤버메소드
	// 빌려주다, 팔리다, 입고되다(등록), ...
}
