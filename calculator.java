
public class calculator {
	
	
	public int add(int x,int y)
	{
		
		return x+y;
		
	}
	public double mul(double a,double b)
	{
		
		return a*b;
	}

	public String myFun()
	{
		
		return "Invalid";
	}
	
	public boolean eligibleforVote(int age)
	{
		if(age<18)
			return false;
		
		else
			return true;
		
		
		
	}
			
}
