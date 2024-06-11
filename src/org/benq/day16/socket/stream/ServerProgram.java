package org.benq.day16.socket.stream;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 요청을 기다리고 있습니다..");
			socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			is = socket.getInputStream();
			int result = is.read();
			System.out.print((char)result);
			result = is.read();
			System.out.print((char)result);
			result = is.read();
			System.out.print((char)result);
			result = is.read();
			System.out.print((char)result);
//			socket.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				socket.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
