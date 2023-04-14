package Week3Day2;

public class ReverseString {
	public static void main(String[]args)
	{
		String p= "punithavalli";
		char[] ch= p.toCharArray();
		for (int i= ch.length-1; i>=0; i--)
		{
			System.out.println(ch[i]);
			
		}
	}

}
