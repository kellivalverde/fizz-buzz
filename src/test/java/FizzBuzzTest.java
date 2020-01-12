import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

	// Arrange
	FizzBuzz underTest = new FizzBuzz(); // constructor

	@Test
	public void shouldSay1For1() {
		// Act
		String result = underTest.getResponse(1);
		// Assert
		assertEquals("1", result); // had to change auto created "return" to 1 instead of 0
	}

	@Test
	public void shouldSay2For2() {

		String result = underTest.getResponse(2);
		assertEquals("2", result);
		// need to return a flexible value (variable) so both tests can pass
	}

	@Test
	public void shouldSayFizzFor3() {
		String result = underTest.getResponse(3);
		assertEquals("Fizz", result);
	}

	@Test
	public void shouldSayBuzzFor5() {
		String result = underTest.getResponse(5);
		assertEquals("Buzz", result);
	}

	@Test
	public void shouldSayFizzFor6() {
		String result = underTest.getResponse(6);
		assertEquals("Fizz", result);
	}

	@Test
	public void shouldSayBuzzFor10() {
		String result = underTest.getResponse(10);
		assertEquals("Buzz", result);
	}

	@Test
	public void shouldSayFizzBuzzFor15() {
		String result = underTest.getResponse(15);
		assertEquals("FizzBuzz", result);
	}

}
