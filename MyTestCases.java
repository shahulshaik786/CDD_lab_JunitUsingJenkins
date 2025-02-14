import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTestCases {

	@Test
	
	public void addTest()
	{
		
		calculator c=new calculator();
		assertEquals("Error Output",-1,c.add(-4, 3));
		
	}
	
	@Test
	public void myFunTest()
	{
		calculator c=new calculator();
		assertEquals("Mismatch","Invalid",c.myFun());
		
	}
	
	@Test
	public void eligibleTest()
	{
		calculator c=new calculator();
	assertTrue("incorrect",c.eligibleforVote(23));
	assertFalse("Wrong",c.eligibleforVote(12));
	
		
		
	}

}
