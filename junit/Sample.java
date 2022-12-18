package org.junit;

public class Sample {
	
	@BeforeClass
	public static void launchBrowser() {
System.out.println("Launch Browser...");
	}
	
	@AfterClass
	public static void closeBrowser() {
		System.out.println("...Close Browser");
	}

	@Before
	public void startTime() {
		System.out.println("Start Time");
	}
	@After
	public void endTime() {
		System.out.println("Time ends");
	}
	@Test
	public void testCase1() {
		System.out.println("Test-1");
	}
	@Test
	public void testCase2() {
		System.out.println("Test-2");
	}
	
}
