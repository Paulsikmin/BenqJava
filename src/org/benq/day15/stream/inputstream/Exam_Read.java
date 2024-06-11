package org.benq.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is = null;
		int readByte;
		try {
			is = new FileInputStream("src/org/benq/day15/stream/inputstream/reading.txt");
			do {
				readByte =  is.read();
				System.out.print((char)readByte);
			}while(readByte != -1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
