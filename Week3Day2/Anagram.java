package Week3Day2;

import java.lang.reflect.Array;

public class Anagram {

	private static char[] length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1= "stops";
		String text2 = "potss";
		int l1 = text1.length();
		//System.out.println(l1);
		int l2 = text2.length();
		//System.out.println(l2);
		if(l1 == l2)
		{
			char[] c1 = text1.toCharArray();
			char[] c2 = text2.toCharArray();
			Arrays.sort1(c1);
			Arrays.sort1(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));	
			Boolean s = Arrays.equals(c1,c2);						
			if (s==true)
			{
				System.out.println(" The srting is anagram ");
							}
			else 
			{
				System.out.println("The String is not anagram"); 
			
		}
		
	}
	}
}


