package week1.day2.assignment1;

public class Polindrome {

	private static final int StrLength = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String Str ="madam";
      String reverse ="";
      for (int i =(StrLength - 1); i >=0; --i)
    	  
{     reverse  = reverse + Str.charAt(i);

}
      if (Str.equals(reverse))
{
	System.out.println(Str + "  is a palindrome String.");
	
} 
     else
     {
	System.out.println(Str + " is not  a palindrome String.");
}
	}

}
