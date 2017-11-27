package OwenC.AutomatedTestingWeek;

import static org.junit.Assert.*;

import org.junit.*;

public class TestClass {

	private static int testInteger;
	
	@BeforeClass
	public static void init() {
		testInteger = 0;
		
	}

	@Before
	public void setUp() {

	}

	@Test
	public void testTest() {
		
		assertTrue("Result wasn't expected", testInteger == 0);
		testInteger++;
		assertFalse("Result wasn't expected", testInteger != 1);
		assertTrue("Result wasn't expected", testInteger == 1);
	}

	@After
	public void tearDown() {

	}

	@AfterClass
	public static void destory() {

	}
}
