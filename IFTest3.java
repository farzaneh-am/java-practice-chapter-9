package chapter9;

public class IFTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intstack mystack;
		Dynstack ds = new Dynstack(5);
		Fixedstack fs=new Fixedstack(8);
		mystack=ds;
		for (int i=0;i<12;i++)
			mystack.push(i);
		mystack=fs;
		for (int i=0;i<8;i++)
			mystack.push(i);
		
		mystack=ds;
		System.out.println("Values in dynamic stack: ");
		for (int i=0;i<12;i++)
			System.out.println(mystack.pop());
		System.out.println();
		mystack=fs;
		for (int i=0;i<8;i++)
			System.out.println(mystack.pop());
	}
}
