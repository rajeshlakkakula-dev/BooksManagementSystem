package BSMS.utils;

public class BooksInformation {

	private String bookName;
	private int bookId;
	private String bookAuthor;
	private String publisher;

	public BooksInformation(String bookName, int bookId, String bookAuthor, String publisher) {
		this.bookName = bookName;
		this.bookId = bookId;
		this.bookAuthor = bookAuthor;
		this.publisher = publisher;
	}

	public String getBookName() {
		return bookName;
	}

	@Override
	public String toString() {
		return "BooksInformation [bookName=" + bookName + ", bookId=" + bookId + ", bookAuthor=" + bookAuthor
				+ ", publisher=" + publisher + "]";
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
