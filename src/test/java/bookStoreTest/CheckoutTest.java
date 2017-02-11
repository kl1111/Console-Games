package bookStoreTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import bookStore.Basket;
import bookStore.Book;
import bookStore.BOOKNAME;
import bookStore.Checkout;

public class CheckoutTest {

	private Book book;
	private Basket basket = new Basket();
	private Checkout checkout = new Checkout();
	private List<Book> bookList;
	private double DEFAULT_BOOK_PRICE = 25.99;
	private int DOUBLE_DELTA = 2;
	double actual;

	@Test
	public void calculatPrice_ReturnsDoubleZero_WhenPassedAnEmptyBasket() {
		// arrange
		// act
		actual = checkout.calculatePrice(new Basket());
		// assert
		assertEquals(0, actual, DOUBLE_DELTA);
	}

	@Test
	public void calculatePrice_ReturnsPriceOfBooksInBasket_WhenBasketWithOneBookIsAdded() {
		// arrange
		book = new Book(BOOKNAME.BOOK5);
		book.setPrice(DEFAULT_BOOK_PRICE);
		basket.addBook(book);
		bookList = basket.getBooksInBasket();
		// act
		actual = checkout.calculatePrice(basket);
		// assert
		assertEquals(DEFAULT_BOOK_PRICE, actual, DOUBLE_DELTA);
	}

	@Test
	public void calculatePrice_returnsPriceOfBooksInBasket_WhenTwoBooksPresentInBasket() {
		// arrange
		book = new Book(BOOKNAME.BOOK5);
		book.setPrice(DEFAULT_BOOK_PRICE);
		basket.addBook(book);
		basket.addBook(book);
		bookList = basket.getBooksInBasket();
		// act
		actual = checkout.calculatePrice(basket);
		int numBooks = bookList.size();
		// assert
		assertEquals(DEFAULT_BOOK_PRICE * numBooks, actual, DOUBLE_DELTA);
	}

	@Test
	public void calculatePrice_returnsDiscountedOnePercentDiscount_WhenThreeBooksPresentInBasket() {
		//arrange
		book = new Book(BOOKNAME.BOOK1);
		book.setPrice(DEFAULT_BOOK_PRICE);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);

		bookList = basket.getBooksInBasket();
		// act
		actual = checkout.calculatePrice(basket);
		int numBooks = bookList.size();
		double discount = 0.99;
		// assert
		assertEquals(DEFAULT_BOOK_PRICE * numBooks * discount, actual, DOUBLE_DELTA);
	}

	@Test
	public void calculatePrice_returnsDiscountedTwoPercentDiscount_WhenSevenBooksPresentInBasket() {
		//arrange
		book = new Book(BOOKNAME.BOOK1);
		book.setPrice(DEFAULT_BOOK_PRICE);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);

		bookList = basket.getBooksInBasket();
		// act
		actual = checkout.calculatePrice(basket);
		int numBooks = bookList.size();
		double discount = 0.98;
		// assert
		assertEquals(DEFAULT_BOOK_PRICE * numBooks * discount, actual, DOUBLE_DELTA);
	}

	@Test
	public void calculatePrice_returnsDiscountedThirteenPercentDiscount_WhenTenBooksPresentInBasket() {
		//arrange
		book = new Book(BOOKNAME.BOOK1);
		book.setPrice(DEFAULT_BOOK_PRICE);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);

		bookList = basket.getBooksInBasket();
		// act
		actual = checkout.calculatePrice(basket);
		int numBooks = bookList.size();
		double discount = 0.87;
		// assert
		assertEquals(DEFAULT_BOOK_PRICE * numBooks * discount, actual, DOUBLE_DELTA);
	}

}
