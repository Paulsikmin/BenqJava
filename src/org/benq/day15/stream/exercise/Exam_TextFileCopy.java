package org.benq.day15.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {

	public static void main(String[] args) {
		// c:\\windows\\system.ini 을 복사해서
		// c:\\Temp\\system.txt 로 만들어주세요. 
		// 단 문자기반 스트림을 사용하세요.
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader("c:\\windows\\system.ini");
			writer = new FileWriter("c:\\Temp\\system.txt");
			int readCount;
			char [] cBuf = new char[10];
			while(true) {
				readCount = reader.read(cBuf);
				if(readCount == -1) break;
				writer.write(cBuf, 0, readCount);
				writer.flush();
			}
//			while((readCount = reader.read(cBuf)) != -1) {
//				
//			}
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
