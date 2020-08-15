package chapter9;
interface Callback{
	void callback(int a);
}
class Client implements Callback{
	public void callback(int b) {
		System.out.println("Callback called with "+b);
	}
	void nonIfacemeth() {
		System.out.println("classes that implements interface "+"may also define other members,too.");
	}
}
class AnotherClient implements Callback{
	public void callback(int p) {
		System.out.println("Another version of callback");
		System.out.println("p squared is"+p*p);
		
	}
	
}
abstract class Incomplete implements Callback{
	int a,b;
	public void show() {
		System.out.println(a+" "+b);
		
	}
}
class farzaneh_am extends Incomplete{
	void mohsen() {
		System.out.println("neda");
	}
	public void callback(int r) {
		System.out.println("sara");	
	}
	
}
public class TestiIface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callback c=new Client();
		AnotherClient ob=new AnotherClient();
		Client d=new Client();
		d.nonIfacemeth();
		d.callback(109);
		System.out.println();
		c.callback(42);
		c=ob;
		c.callback(42);
		farzaneh_am s=new farzaneh_am();
		s.a=10;
		s.b=20;
		s.show();
		
		

	}

}
