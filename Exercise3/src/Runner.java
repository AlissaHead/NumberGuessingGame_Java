
public class Runner 
{
	
	
	public int Guess(int usernum, int num1, int max, int min)
	{
		if (usernum < min)
		{
			return -2;
		}
		
		if (usernum > max)
		{
			return 2;
		}
		
		if (usernum > num1)
		{
			return -1;
		}
		
		if (usernum == num1)
		{
			return 0;
		}
		
		return 1;
	}
	
	
}
