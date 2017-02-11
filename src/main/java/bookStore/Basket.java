package bookStore;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	private List<Book> bookList = new ArrayList<Book>();
	private Book book;

	public List<Book> getBooksInBasket() {
		return bookList;
	}

	public void addBook(Book book) {
		bookList.add(book);
	}

}
