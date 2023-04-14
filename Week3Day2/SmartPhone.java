package Week3Day2;

public class SmartPhone extends AntroidPhone {
	public void TakeVideo() {
		System.out.println("Take video in smartphone");
	}
	
public static void main(String[]args)
{
	SmartPhone phone = new SmartPhone();
	phone.TakeVideo();
	phone.takeVideo();
}
}
