package test.test.test.vo;

import org.apache.ibatis.type.Alias;

@Alias("book")
public class Book {

	private Integer bookNumber;
	private String bookName;
	private String bookPrice;
	
	public Book() {};
	public Book(Integer bookNumber, String bookName, String bookPrice) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}


	public Integer getBookNumber() {
		return bookNumber;
	}


	public void setBookNumber(Integer bookNumber) {
		this.bookNumber = bookNumber;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}


	@Override
	public String toString() {
		return "book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
}
