/**
 * NIIT TERM AND CND
 */
package pkg1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Clazz1Test {
	Clazz1 c= new Clazz1();
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		
		int x = 30;
		int add = c.add(10, 20);
		assertEquals(x, add);
	}

	@Test
	public void testSub() {
		int x = 10;
		int add = c.sub(20, 10);
		assertEquals(x, add);	}

	@Test
	public void testMul() {
		int x = 300;
		int add = c.mul(10, 30);
		assertEquals(x, add);
	}

}
