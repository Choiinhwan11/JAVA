package io;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DataStream {

	public static void main(String[] args) throws FileNotFoundException , IOException {
		//BufferedOutputStream byte 단위 처리하는 메소드가 int, byte밖에 없다.
		//DataOutputSteam write 의 종류가 많아서 더 많이 쓴다.
		//printStream 모든 출력이 println 이나 print 로 모든 메소드가 오버로드되어서 처리할 떄 편하다. 더더 많이 쓴다. 
//		DataOutputStream bos = new DataOutputStream(new FileOutputStream("result.txt"));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//파일로부터 출력
		FileOutputStream fos = new FileOutputStream("result.txt");
		DataOutputStream bos = new DataOutputStream(fos);
		bos.writeUTF("홍길동");
		bos.writeInt(25);
		bos.writeDouble(185.3);
		bos.close();
		//파일로부터 입력
		DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
		String name = dis.readUTF();
		int age = dis.readInt();
		double height = dis.readDouble();
		System.out.println("이름 = " + name);
		System.out.println("나이  = " + age);
		System.out.println("키  = " + height);
		//들어간 순서대로 들어와야한다.
		
		
		
		//BufferedWriter  char 단위
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.append("0 2 3 ");
		bw.append("0 2 3 ");
		bw.append("0 2 3 ");
		bw.flush();

		
	}

}
