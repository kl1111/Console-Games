package bookStore;

import java.util.List;

public class Checkout {

	private Basket basket;
	private List<Book> bookList;
	double total = 0;

	public double calculatePrice(Basket basket) {
		bookList = basket.getBooksInBasket();

		if (bookList.size() % 10 == 0) {
			booksInBasket();
			total = total * 0.87;
			return total;
		} else if (bookList.size() % 7 == 0) {
			booksInBasket();
			total = total * 0.98;
			return total;
		} else if (bookList.size() % 3 == 0) {
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
