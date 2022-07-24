package test.calculator;

import calculator.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

	private Calculator cal;

	@Before
	public void setup() {
		cal = new Calculator();
		System.out.println("before");
	}

	@Test
	public void add() {
		assertEquals(9, cal.add(6, 3));
		System.out.println("add");
	}

	@Test
	public void subtract() {
		assertEquals(3, cal.substract(6 ,3));
		System.out.println("substract");
	}

	@After
	public void teardown() {
		System.out.println("teardown");
	}
}
