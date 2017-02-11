package bookStore;

public class Book {
	
	double price;
	private BOOKNAME bookName;
	
	public Book(BOOKNAME bookName){
		this.setBookName(bookName);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public BOOKNAME getBookName() {
		return bookName;
	}

	public void setBookName(BOOKNAME bookName) {
		this.bookName = bookName;
	}
	
	

}
