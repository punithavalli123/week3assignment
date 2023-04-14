package Week3Day2;

public class FindCount1 {

	public static void main(String[] args) {
	String p = "punithavalli";
	int count=0;
	char[] charArray = p.toCharArray();	
	for (int i=0; i<=p.length()-1; i++)
			{
		if (p.charAt(i)=='a')
		{
		count++;
		}
		{
		System.out.println("The occurance of a in the String is : " +count);
		
		}
		
			}
		

	}

}
