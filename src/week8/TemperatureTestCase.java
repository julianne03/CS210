package week8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTestCase {
	
	Temperature temp = new Temperature();
	
	double testFahreheit = temp.toCelsius(105);
	double testCelcius = temp.toFahrenheit(11);

	double actualCelcius = 41;
	double actualFahrenheit = 50;
	double cDiff = 1;

	@Test
	public void testtoCelcius() {
		System.out.println("testing value: " + testFahreheit + ", expected value: " + actualCelcius);
		// third parameter is for rounding
		assertEquals(testFahreheit, actualCelcius, cDiff);
		System.out.println("testing value: " + testCelcius + ", expected value: " + actualFahrenheit);
		assertEquals(testCelcius, actualFahrenheit, cDiff);
	}

}
