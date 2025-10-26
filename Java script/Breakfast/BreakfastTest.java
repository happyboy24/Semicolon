import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BreakfastTest {  
	@Test
	public void testThatASentenceIsCollected() {	
		Breakfast breakfast = new Breakfast();			
		String result = breakfast.getSentence("The lord is good.");		
		assertEquals(result, "The lord is good.");				

	}

	@Test
	public void testThatASentenceIsCollectedAndConvertedToUpperCase() {
		Breakfast breakfast = new Breakfast();
		String result = breakfast.convert("The lord is good.");
		assertEquals(result, "THE LORD IS GOOD");

	}


}
