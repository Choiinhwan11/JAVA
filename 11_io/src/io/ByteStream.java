package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("data.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		//int 형으로 반환한다.
		int data;
		while((data = bis.read())!= -1) {
			System.out.print((char)data);
		}
		
		
		

	}

}
