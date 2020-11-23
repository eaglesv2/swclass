package Nov_23_Test;

import java.util.ArrayList;
import java.util.Scanner;

class Bookstore {
	private String book_name;
	private String book_genre;
	private int book_price;
	
	public Bookstore(String book_name, String book_genre, int book_price) {
		this.book_name = book_name;
		this.book_genre = book_genre;
		this.book_price = book_price;
	}
	
	public Bookstore() {
		
	}
	
	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_genre() {
		return book_genre;
	}

	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	
	public String toString() {
		return "[책이름]" + book_name + " [장르]" + book_genre + " [책가격]" + book_price + "원";
	}
}

public class BookstoreClass {
	static ArrayList<Bookstore> books = new ArrayList<Bookstore>();
	
	private static void BookList(ArrayList<Bookstore> arr) {
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i).getBook_name() + "\t");
			System.out.print(arr.get(i).getBook_genre() + "\t");
			System.out.println(arr.get(i).getBook_price());
		}
	}
	
	private static int BookSearch() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 장르는 ? ");
		String genre_search = sc.next();
		System.out.print("검색할 가격은 ? ");
		int price_search = sc.nextInt();
		
		int count = 0;
		for(int i=0; i<books.size(); i++) {
			if(books.get(i).getBook_genre().equals(genre_search) && books.get(i).getBook_price() >= price_search) {
				System.out.println(books.get(i).getBook_name()); 
				count ++;
			}
		}
		sc.close();
		
		return count;
	}
	
	
	public static void main(String args[]) {
		Bookstore b1 = new Bookstore();

		b1.setBook_name("사라진 밤");
		b1.setBook_genre("소설");
		b1.setBook_price(12000);
		//System.out.println(b1.toString());
		
		Bookstore b2 = new Bookstore("별이 빛나는 밤에","소설",10000);
		
		//System.out.println(b2.toString());
		
		books.add(b1);
		books.add(b2);
		books.add(new Bookstore("우리는 해낼 수 있다","자기개발",12000));
		books.add(new Bookstore("나무와 숲","판타지",20000));
		books.add(new Bookstore("나의 연극 인생","자서전",30000));
		books.add(new Bookstore("잠자는 공주","판타지",15000));
		books.add(new Bookstore("질문의 방향","자기개발",13000));
		
		BookList(books);
		
		System.out.println("검색된 책은 모두 " + BookSearch() + "권 입니다" );
		
	}
}