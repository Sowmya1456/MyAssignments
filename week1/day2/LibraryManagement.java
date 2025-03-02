package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library newObject=new Library();
		String book = newObject.addBook("Selenium");
		System.out.println(book);
		newObject.issueBook();
	}
}
