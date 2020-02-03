

import static org.junit.Assert.*;
import org.junit.Test;
import com.qa.tutorial.Runner;

public class runnerTest {
	
	@Test
	public void greetingTest() {
		Runner runner = new Runner();
		assertNotEquals("hea", runner.greeting());
	}
	@Test
	public void greetingTest2() {
		Runner runner = new Runner();
		assertEquals("hello world", runner.greeting());
	}
	

}
