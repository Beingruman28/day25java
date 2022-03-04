package day25java;

import static org.junit.Assert.assertFalse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertDemo1 
{
		
		public void Simple() 
		{
			String A ="abc";
			boolean B  = true;
			assertFalse(A,B);
		}
		@Test
		public void Simple1() 
		{
			String A ="abc";
			boolean B  = false;
			assertFalse(A,B);
		}
		@Test
		@Disabled
		public void Simple2() 
		{
			String A ="abcd";
			boolean B  = true;
			assertFalse(A,B);
		}
	}


