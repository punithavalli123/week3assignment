package Week3Day2;
import java.util.Arrays;


public class MinMaxArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {22, 3981,-19, 82,0,45,37};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers[1]);
		System.out.println(numbers[numbers.length-2]);
		

	}

}
