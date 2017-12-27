package assignment2;

import java.util.List;

public class Student {
	
	
	private int studentId;
	private String studentName;
	private String address;
	private String mobileNum;
	private int libCards;
	private List<Book> listOfBooks;
	private int fine;
	
	
	public Student(int studentId, String studentName, String address, String mobileNum, int libCards,
			List<Book> listOfBooks, int fine) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.mobileNum = mobileNum;
		this.libCards = libCards;
		this.listOfBooks = listOfBooks;
		this.fine = fine;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public int getLibCards() {
		return libCards;
	}
	public void setLibCards(int libCards) {
		this.libCards = libCards;
	}
	public List<Book> getListOfBooks() {
		return listOfBooks;
	}
	public void setListOfBooks(List<Book> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
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
		Student other = (Student) obj;
		if (studentId != other.studentId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address
				+ ", mobileNum=" + mobileNum + ", libCards=" + libCards + ", listOfBooks=" + listOfBooks + ", fine="
				+ fine + "]";
	}
	
	

}
