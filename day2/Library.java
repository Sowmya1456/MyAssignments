package week1.day2;

public class Library {
	
	String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
	
		Library libraryObject=new Library();
		System.out.println(libraryObject.addBook("Java"));
		libraryObject.issueBook();
	}
}
