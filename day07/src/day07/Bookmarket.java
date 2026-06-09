package day07;

import java.util.Scanner;

class Book {
	String title,author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}


public class Bookmarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book [] book = new Book[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
			System.out.println("제목>>");
			String title = scanner.nextLine();
			System.out.println("저자>>");
			String author = scanner.nextLine();
			book[i] = new Book(title,author);
		}
		
		for(int i =0; i<book.length; i++) 
			System.out.println("("+ book[i].title +"," + book[i].author + ")");
		
		scanner.close();

	}

}
