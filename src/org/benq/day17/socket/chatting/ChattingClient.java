package org.benq.day17.socket.chatting;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChattingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "192.168.60.227";
		int port = 9999;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket(address, port);
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("서버와 연결이 완료되었습니다!");
			while(true) {
				String recvMsg = dis.readUTF();
				if("end".equals(recvMsg)) {
					System.out.println("채팅이 종료되었습니다.");
					break;
				}
				System.out.print("서버(상대) : " + recvMsg);
				System.out.println();
				System.out.print("클라이언트(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}





















