package chapter9;
interface A22{
	void meth1();
	void meth2();
}
interface B22 extends A22{
	void meth3();
}
class Myclass implements B22{
	public void meth1() {
		System.out.println("Implements meth1.");
	}
	public void meth2() {
		System.out.println("Implements meth2.");
	}
	public void meth3() {
		System.out.println("Implements meth3.");
	}
}
public class IFextends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass ob=new Myclass();
		ob.meth1();
		ob.meth2();
		ob.meth3();

	}

}
