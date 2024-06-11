package org.benq.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/org/benq/day15/stream/outputstream/writing2.txt");
			byte [] data = "한번 더 입출력".getBytes();
			os.write(data);
			os.flush();			// 버퍼비우기
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
