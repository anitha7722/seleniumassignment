package week1.day2.assignment1;

public class ChangeOddIndexToUpperCase 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
           String test = "changeme";
           char[] chars = test.toCharArray();

	              for(int i= 0;i<chars.length;i++)
	{
	    
		             if (i % 2 != 0)
		{
			
			          char chrs1 =Character.toUpperCase(chars[i]);
			          System.out.println(chrs1);
		}
		else 
		{
			System.out.print(chars[i]);
		}
	}
	
	}

	
	
}

	

	
	
	


