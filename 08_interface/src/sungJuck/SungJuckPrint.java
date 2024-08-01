package sungJuck;

import java.util.ArrayList;

public class SungJuckPrint implements SungJuck{
	@Override
	public void excute(ArrayList<SungJuckDTO> list) {
		if(list.isEmpty()) {
			System.out.println("리스트가 비어있습니다.");
		}else {
			System.out.print("번호\t");
			System.out.print("이름\t");
			System.out.print("국어\t");
			System.out.print("영어\t");
			System.out.print("수학\t");
			System.out.print("총점\t");
			System.out.println("평균\t");
			for(SungJuckDTO data : list) {
				System.out.println(data.toString());
			}
		}
		
	}
}
