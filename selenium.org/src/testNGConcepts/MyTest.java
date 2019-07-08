package testNGConcepts;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MyTest {

	
	@Test
	public void test(){
		Assert.assertEquals(true, false);
		System.out.println("This is test Method");
	}
	@Test
	public void test1(){
		Assert.assertEquals(false, true);
		System.out.println("This is test2 method");
	}
	@Test
	public void test3(){
		Assert.assertEquals(true, false);
		System.out.println("This is test 3 method");
	}
	
}
