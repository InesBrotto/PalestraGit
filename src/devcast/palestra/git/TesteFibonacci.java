package devcast.palestra.git;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteFibonacci {

	@Test
	public void test() {
		Fibonacci fibonacci = new Fibonacci();
		assertEquals(0, fibonacci.calcularFibonacci(0));
		assertEquals(1, fibonacci.calcularFibonacci(1));
	}

}
