package Week3Day2;

import org.apache.commons.math3.geometry.spherical.oned.ArcsSet.Split;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text= " We learn javabasics as part of java sessions in java weeks";

		int count = 0;
		
		String[] s = text.split("");
		int l = s.length;
		String duplicate = " ";
		String remove = " ";
		for ( int i = 0; i<=l-1; i++)
		{ 
			for (int j = i+1; j<=l-1; j++) {
				if(s[i].equalsIgnoreCase(s[j]))
				{
					count++;
					duplicate = s[j];
					
				}
			}
		}
		
		if (count >0)
		{
			remove = text.replaceAll(duplicate, " " );
			
		}
		else 
		{
			remove =text;
	}
	System.out.println("The string without duplicate words is " +" "+remove);
		
		
	}

}
