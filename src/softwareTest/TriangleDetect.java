package softwareTest;

public class TriangleDetect {
	
	
	
	public   TriangleDetect()
	{
		
	}
	public boolean isTri(int a1,int a2,int a3)
	{
		if(((a1+a2)>a3)&&((a1+a3)>a2)&&((a2+a3)>a1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String  test(int b1,int b2,int b3)
	{
		
		
		
		if(isTri(b1,b2,b3))
		{
			if((b1==b2)&&(b2==b3))
			{
				return "equilateral";
			}
			else if((b1==b2)||(b2==b3)||(b1==b3))
			{
				return "isosceles";
			}
			else 
			{
				return "scalene";
			}
		}
		else 
		{
			return "not a triangle";
		}
		
	}

}
