package Library;

import java.util.ArrayList;
import java.util.Scanner;

import Library.Author;
import Library.Books;
import Library.Status;

public class Main {
	public static void main(String[]args){
		ArrayList<Status> l_status = new ArrayList<Status>();
		l_status.add(new Status("Trong kho"));
		l_status.add(new Status("Trung bay"));
		l_status.add(new Status("Da cho muon"));
		ArrayList<Author> l_author = new ArrayList<Author>();
		l_author.add(new Author("Shinkai Makoto"));
		l_author.add(new Author("To Hoai"));
		l_author.add(new Author("J. R. R. Tolkien"));
		ArrayList<Books> l_book = new ArrayList<Books>();
		l_book.add(new Books("J001","Khu vuon ngon tu",l_author.get(0),l_status.get(1),8));
		l_book.add(new Books("J002","Khu vuon ngon tu",l_author.get(0),l_status.get(0),15));
		l_book.add(new Books("J003","5cm/s",l_author.get(0),l_status.get(1),9));
		l_book.add(new Books("J004","5cm/s",l_author.get(0),l_status.get(3),13));

		l_book.add(new Books("V001","Lao Hac",l_author.get(1),l_status.get(0),11));
		l_book.add(new Books("V002","Lao Hac",l_author.get(1),l_status.get(2),20));
		l_book.add(new Books("V003","Chi Pheo",l_author.get(1),l_status.get(1),19));
		l_book.add(new Books("V004","Chi Pheo",l_author.get(0),l_status.get(2),5));

		l_book.add(new Books("E001","Chua te nhung chiec nhan",l_author.get(2),l_status.get(2),11));
		l_book.add(new Books("E002","Chua te nhung chiec nhan",l_author.get(2),l_status.get(1),1));
		l_book.add(new Books("E003","Chang trai Hobbit",l_author.get(2),l_status.get(2),4));
		l_book.add(new Books("E004","Chang trai Hobbit",l_author.get(2),l_status.get(1),8));
		
		System.out.println("Nhập tên sách: ");
		Scanner input= new Scanner(System.in);
		String name;
		name= input.nextLine();
		for(int i=0;i<12;i++){
			if (name.equals(l_book.get(i).getName())){
				System.out.printf("%s-%s-%s-%s-%d \n", l_book.get(i).getID(), l_book.get(i).getName(), l_book.get(i).getAuthor().getAuthor(),l_book.get(i).getNumbers());
				}
	     	}
		}
}