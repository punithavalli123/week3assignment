package Week3Day2;

import java.lang.reflect.Array;

public class MissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] x   = {1,2,3,4,7,6,8};
Arrays.sort(x);
int len= x.length;
for(int i =0; i<len; i++)
{
	
	if(i!=x[i])
	{
		System.out.println(x[i]);
		break;
	}
}
}


	

}

