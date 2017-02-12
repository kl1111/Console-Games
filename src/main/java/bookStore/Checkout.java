package bookStore;

import java.util.List;

public class Checkout {

	private Basket basket;
	private List<Book> bookList;
	double total = 0;

	public double calculatePrice(Basket basket) {
		bookList = basket.getBooksInBasket();

		// For 10 books, apply discount of 10% and 1% off for every 3 books
		if (bookList.size() % 10 == 0) {
			booksInBasket();
			total = total * 0.87;
			return total;
		}
		// For 7 books, apply 2% discount
		else if (bookList.size() % 7 == 0) {
			booksInBasket();
			total = total * 0.98;
			return total;
		}
		// for 3 books, apply 1% discount
		else if (bookList.size() % 3 == 0) {
			booksInBasket();
			total = total * 0.99;
			return total;
		} else {
			booksInBasket();
			return total;
		}
	}

	public void booksInBasket() {
		for (Book book : bookList) {
			total += book.getPrice();
		}
	}

}
