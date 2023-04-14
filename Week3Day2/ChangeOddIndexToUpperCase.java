package Week3Day2;

public class ChangeOddIndexToUpperCase {

	private static String lowercase;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Changeme";
		char[] ch = s.toCharArray();
		int l = s.length();
			
for (int i=0; i<=l-1; i++)
{
	if(i%2!=0)
	{
		//cc = cc+(Character.toUpperCase(s[i]));
		s= s.toUpperCase();
		
	}
	else 
	{
		s = s.toLowerCase();
		
	}
	System.out.println(" converted string is "  +s.toUpperCase());
	
	}

}

}
