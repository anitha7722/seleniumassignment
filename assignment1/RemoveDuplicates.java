package week1.day2.assignment1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String text = "We learn java basics as part of java sessions in java week1";
  String[] words = text.split(" ");
  int count = 1;
  for (int i =0;i<words.length;i++)
  {
	  for (int j =i+1;j<words.length;j++)
	  {
		  if(words[i].equals(words[j]))
	  {
		  words[j]=" ";
	  }
		  
	  else {
		  System.out.print(words[i]+ " ");
	  }
  }
	}

}
}
