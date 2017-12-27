package assignment2;

import java.util.Date;
import java.util.List;

public class Library {
	
	private List<Book> listOfBooks;
	private List<Student> listOfStudents;
	
	
	
	public Library(List<Book> listOfBooks, List<Student> listOfStudents) {
		super();
		this.listOfBooks = listOfBooks;
		this.listOfStudents = listOfStudents;
	}

	
	
	public List<Book> getListOfBooks() {
		return listOfBooks;
	}

	public void setListOfBooks(List<Book> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}

	public List<Student> getListOfStudents() {
		return listOfStudents;
	}

	@Override
	public String toString() {
		return "Library [listOfBooks=" + listOfBooks + ", listOfStudents=" + listOfStudents + "]";
	}

	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}

	public int issueBook(Student student,Book book) throws BookNotFoundException
	{
		for(Student tempStudent: listOfStudents)
		{
			if(tempStudent.getStudentId() == student.getStudentId() && student.getLibCards() >= 1 )
			{
				
				for(Book tempBook : listOfBooks )
				{
					if( tempBook.getBookId() == book.getBookId() && tempBook.isInLibraray())
					{	
						tempStudent.setLibCards(tempStudent.getLibCards() - 1);
						if(tempBook.getNoOfCopies() == 1)
						{
							tempBook.setNoOfCopies(tempBook.getNoOfCopies() - 1);
							tempBook.setInLibraray(false);
						}
						else
						{
							tempBook.setNoOfCopies(tempBook.getNoOfCopies() - 1);
						}
						tempBook.setIssueDate(new Date());
						tempStudent.getListOfBooks().add(tempBook);
						return 1;
					}
					else
						throw new BookNotFoundException("No Such book in Library");
				}
			}
		}
		return 0;
	}
	
	public int returnBook(Student student,Book book) throws BookNotFoundException
	{
		for(Student tempStudent: listOfStudents)
		{
			if(tempStudent.getStudentId() == student.getStudentId())
			{
				for(Book tempBook : listOfBooks )
				{
					if( tempBook.getBookId() == book.getBookId())
					{	
						tempStudent.setLibCards(tempStudent.getLibCards() + 1);
						tempBook.setNoOfCopies(tempBook.getNoOfCopies() + 1);
						tempBook.setReturnDate(new Date());
						tempStudent.getListOfBooks().remove(tempBook);
						long diff = tempBook.getReturnDate().getTime() - tempBook.getIssueDate().getTime();
						long days = (diff / (1000 * 60 * 60 * 24 )) % 365; 
						if (diff > 7)
						{
							int tempFine = (int) diff - 7 ;
							tempStudent.setFine(tempStudent .getFine() + 2 * tempFine);
						}
						return 1;
					}
				}
			}
		}
		return 0;
	}
	
	
	
	
	

}
