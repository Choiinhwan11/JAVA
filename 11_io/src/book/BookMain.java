package book;

public class BookMain {

	public static void main(String[] args) {
		BookService bookService = new BookService();
		bookService.menu();
		System.out.println("프로그램을 종료합니다.");

	}

}

/*
[문제] 도서
Package : book

Interface : Book.java

Class     : BookMain.java
            BookService.java
            BookDTO.java

            BookInsert.java
            BookPrint.java
            BookFileWrite.java
            BookFileRead.java
            BookTitleDesc.java

             
필드
code, title, author, price, qty, total

메뉴
1. 등록
2. 출력
3. 파일 저장
4. 파일 읽기
5. 책 제목으로 내림차순
6. 끝

번호 선택 : 

조건
1. 입력 할 때 데이터 중복 허용
book01	자바		김자바		35000		10
book02	스프링		이봄		40000		5
book01	자바		김자바		35000		8
book01	자바		김자바		35000		2


2. 파일명 "book.txt" 한다.
 */





