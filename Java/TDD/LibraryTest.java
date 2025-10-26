import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LibraryTest {

	@Test
	public void testThatLibraryHasNoBook() {
	// Arrange

	Library library = new Library();

	// Act
	int result = library.totalNumberOfBooks();
	
	// Assert
	assertEquals(result, 0);
	}

	@Test
	public void testThatOneBookIsAddedToTheLibraryAndTheTotalNumberOfBooksIsOne() {

	//Arrange
	Library library = new Library();

	// Act 
	String response = library.addBook("Things Fall Apart");

	// Assert
	assertEquals(response, "Book added successfully");

}
	@Test
	public void testThatBookIsAddedToTheLibraryAndTheTotalNumberOfBooksIsOne() {

	//Arrange
	Library library = new Library();

	// Act 
	library.addBook("independence by sarah ladipo");
	int result = library.totalNumberOfBooks();

	// Assert
	assertEquals(result, 1);


}

}