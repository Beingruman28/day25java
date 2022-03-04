package day25java;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class AssertDemo 
  {
	@Test
	public void Simple() 
	{
		int A =1;
		int B =1;
		assertEquals(A,B);
	}
	@Test
	public void Simple1() 
	{
		int A =1;
		int B =2;
		assertEquals(A,B);
	}
	@Test
	@Disabled
	public void Simple2() 
	{
		int A =1;
		int B =3;
		assertEquals(A,B);
	}
}
