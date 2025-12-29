package selenium;

import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.Assert;
import org.junit.Rule;

public class Testing3 {

	@Rule
	public ErrorCollector err= new ErrorCollector();
	@Test
	public void test6() {
		String expected = "abc";
		String actual = "abc";
		System.out.println("before 1st Assert");
		Assert.assertEquals(expected,actual); // We use regular assert in the industry
		System.out.println("after 1st Assert");
		Assert.assertTrue("Verify 2>3",2>3);
		System.out.println("After 2nd Assert");
		}
	

		@Test
		public void test7() {
		String expected = "abc";
		String actual = "abc";
		System.out.println("before 1st Assert");
		try {
		Assert.assertEquals(expected,actual); // We use regular assert in the industry
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I am in First catch");
		}
		System.out.println("after 1st Assert");
		try {
		Assert.assertTrue("Verify 2>3",2>3);
		}catch(Throwable t) {
		err.addError(t);
		System.out.println("i am in second catch");
		}	System.out.println("After 2nd Assert");
}}