package week1.day2;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library obj1=new Library();
		String newBook=obj1.addBook("Java");
		obj1.issueBook();
		
	}
	
	String addBook(String bookTitle)
	{
		String bookName=bookTitle;
		System.out.println("Book added sucessfully " + bookName);
		return bookName;
		
	}
	
	void issueBook()
	{
				System.out.println("Book issued sucessfully");
		
	}

}
