package org.benq.day15.stream.bufferedstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_BufferedStream {

	public static void main(String[] args) {
		Reader reader = null;		// 문자기반
//		InputStream is = null;		// 바이트기반
		BufferedReader bReader = null;
		int readCount;
		try {
			reader = new FileReader("src/org/benq/day15/stream/bufferedstream/Exam_BufferedStream.java");
			bReader = new BufferedReader(reader);
			char [] cBuf = new char[1024];
			readCount = bReader.read(cBuf);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				bReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
