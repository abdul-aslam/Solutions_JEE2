package assignment2;

import java.util.Date;

public class Book {
	
	private int bookId;
	private String bookName;
	private String authorName;
	private String publisherName;
	private String typeOfBook;
	private int noOfCopies;
	private boolean inLibraray;
	private Date issueDate;
	private Date returnDate;
	
	
	
	
	
	public Book(int bookId, String bookName, String authorName, String publisherName, String typeOfBook, int noOfCopies,
			boolean inLibraray, Date issueDate, Date returnDate) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisherName = publisherName;
		this.typeOfBook = typeOfBook;
		this.noOfCopies = noOfCopies;
		this.inLibraray = inLibraray;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getTypeOfBook() {
		return typeOfBook;
	}
	public void setTypeOfBook(String typeOfBook) {
		this.typeOfBook = typeOfBook;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	
	public boolean isInLibraray() {
		return inLibraray;
	}
	public void setInLibraray(boolean inLibraray) {
		this.inLibraray = inLibraray;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookId != other.bookId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", publisherName="
				+ publisherName + ", typeOfBook=" + typeOfBook + ", noOfCopies=" + noOfCopies + ", inLibraray="
				+ inLibraray + ", issueDate=" + issueDate + ", returnDate=" + returnDate + "]";
	}
	
	
	
	
	
	

}
