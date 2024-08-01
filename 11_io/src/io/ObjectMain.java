package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//파일로부터 저장
		PersonDTO dto = new PersonDTO("홍길동", 25, 185.3);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		oos.writeObject(dto);
		oos.close();
		//파일로부터 읽기
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		PersonDTO dto2 = (PersonDTO)ois.readObject();
		System.out.println("이름 = " + dto.getName());
		System.out.println("나이 = " + dto.getAge());
		System.out.println("몸무게 = " + dto.getHeight());
		
		
		
//		int size = (int) file.length();
//		byte[] ar = new byte[size];
//		bis.read(ar, 0, size); 
//		//0번쨰 방부터 배열 ar 에 size만큼 넣어라.
//		System.out.println(new String(ar)); // byte[] -> String 변동
//		bis.close();
	}
	

}
