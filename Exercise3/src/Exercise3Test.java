import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise3Test 
{

	@Test
	void test() 
	{
		var runner = new Runner();
		assertEquals(1, runner.Guess(6, 16, 10000, 1));
		assertEquals(0, runner.Guess(2, 2, 10000, 1));
		assertEquals(-1, runner.Guess(3, 1, 10000, 1));
		assertEquals(-2, runner.Guess(0, 1, 10000, 1));
		assertEquals(2, runner.Guess(10001, 10000, 1, 1));
	}

}
