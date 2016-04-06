package simpleCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(10, 20);
		assertEquals(30, calc.getResult());
	}
	
	@Test
	public void testSub() {
		Calculator calc = new Calculator();
		calc.sub(10, 20);
		assertEquals(-10, calc.getResult());
	}
	@Test
	public void testmulti(){
		Calculator calc = new Calculator();
		calc.multi(2, 3);
		assertEquals(6,calc.getResult());
	}

}
