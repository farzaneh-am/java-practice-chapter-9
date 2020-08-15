package chapter9;
interface printabl1{
	void print();
}
class AB implements printabl1{
	public void print() {
		System.out.println("Hello");
	}
	
}
public class printable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB ob=new AB();
		ob.print();

	}

}
