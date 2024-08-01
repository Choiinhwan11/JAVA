package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int size = (int) file.length();
		byte[] ar = new byte[size];
		bis.read(ar, 0, size); 
		//0번쨰 방부터 배열 ar 에 size만큼 넣어라.
		System.out.println(new String(ar)); // byte[] -> String 변동
		bis.close();
		

	}

}
