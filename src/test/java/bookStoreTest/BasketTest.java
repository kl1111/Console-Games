package bookStoreTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import bookStore.Basket;
import bookStore.Book;
import bookStore.BOOKNAME;

public class BasketTest {

	private Book book;
	private Basket basket = new Basket();
	private List<Book> bookList = new ArrayList<Book>();

	@Test
	public void getBooksInBasket_ReturnsEmptyList_IfNoBooksAreAdded() {
		// arrange
		// act
		basket.getBooksInBasket();
		// assert
		assertEquals(0, bookList.size());
	}

	@Test
	public void getBooksInBasket_ReturnsArrayLengthOfOne_WhenBookMethodIsCalledWithOneBook() {
		// arrange
		book = new Book(BOOKNAME.BOOK1);
		// act
		basket.addBook(book);
		bookList = basket.getBooksInBasket();
		// arrange
		assertEquals(1, bookList.size());
	}

	@Test
	public void getBooksInBasket_ReturnsArrayLengthTwo_WhenTwoBooksAreAdded() {
		// arrange
		book = new Book(BOOKNAME.BOOK3);
		Book book1 = new Book(BOOKNAME.BOOK1);
		// act
		basket.addBook(book1);
		basket.addBook(book);
		bookList = basket.getBooksInBasket();
		// arrange
		assertEquals(2, bookList.size());
	}
}
