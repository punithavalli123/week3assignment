package Week3Day2;

public class Staticpolumorphism {
	public void add(int x,  int y)
	{
		System.out.println(x+y);
		
	}

		
public void add(int x , int y , int z )
{
	System.out.println(x+y+x);
	
}
public void multiple(double x , double y)
{
	System.out.println(x*y);
}
public void multiple(float x, float y)
{
	System.out.println(x*y);
}
{
	
}
public static void main(String[]args)
{
	Staticpolumorphism result = new Staticpolumorphism();
	
	result.add(10, 15);
	result.add(10, 10, 10);
	result.multiple(2.22d, 2.33d);
	result.multiple(100.1f, 200.2f);
	
  
}
}
