package chapter9;
interface Bank{
	float RatOfInterest();
}
class SBI implements Bank{
	public float RatOfInterest(){
		return 9.15f;
	}
}
class PNB implements Bank{
	public float RatOfInterest(){
		return 9.7f;
	}
}
public class test_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new SBI();
		System.out.println("ROI: "+b.RatOfInterest());

	}

}
