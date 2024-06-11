package org.benq.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("src/org/benq/day15/stream/inputstream/reading.txt");
			int readCount;
			byte [] readBytes = new byte[3];
			String result = "";
			while(true) {
				readCount = is.read(readBytes, 0, 3);
				if(readCount == -1) break;
				result += new String(readBytes, 0, readCount);
			}
			is.close();
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 예외가 발생하든 안하든 반드시 실행하는 코드
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

