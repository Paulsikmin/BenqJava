package org.benq.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/org/benq/day15/stream/outputstream/writing3.txt");
			byte [] data = "마지막 입출력".getBytes();
			os.write(data, 0, 6);
			os.flush();
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) { // 상위 예외 클래스로 생략될 수 있음.
			e.printStackTrace();
		} catch (IOException e) {		// 상위 클래스가 나중 catch절에 위치
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
