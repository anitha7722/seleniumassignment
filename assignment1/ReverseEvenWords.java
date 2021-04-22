package week1.day2.assignment1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test = "Iam a software tester ";
String[] words = test.split(" ");
    for (int i=0;i<words.length;i++)
    {
    	if (i%2==0)
    	{
    		char[] chars= words[i].toCharArray();
    		for (int j = chars.length -1 ;j>=0;j--)
    		{
    			System.out.print(chars[j]);
    		}
    			System.out.print(" ");
    	}else
    			{
    				 
				
					System.out.print(words[i]);
    			}
    	}
    }



}

