package chapter9;
class A{
public interface NestediF{
	boolean isnotnegative(int x);
}
class B implements A.NestediF{
 public boolean isnotnegative(int x) {
	 return x<0 ?false : true;
 }
	
}
}
public class nestedIfdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.NestediF nif =new B();
		if(nif.isnotnegative(10))
			System.out.println("not negative");
		if(nif.isnotnegative(-12))
			System.out.println("negative");
		
	}

}
