package chapter9;
interface Intstack{
	void push(int item);
	int pop();
}
class Fixedstack implements Intstack{
	private int stack[];
	private int tos;
	Fixedstack(int size){
		stack=new int[size];
		tos=-1;
	}
	
	public void push(int item){
		if(tos==stack.length-1) 
			System.out.println("stack is full.");
		else 
			stack[++tos]=item;
	}
	public int pop(){
		if(tos<0) {
			System.out.println("stack underflow.");	
			return 0;
		}
		else
			return stack[tos--];
	}
}
public class IFTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fixedstack mystack1 = new Fixedstack(5);
		Fixedstack mystack2 = new Fixedstack(8);
		for (int i=0;i<5;i++)
			mystack1.push(i);	
		for(int i=0;i<8;i++)
			mystack2.push(i);
		System.out.println("stack in mystack1.");	
		for (int i=0;i<5;i++)
			System.out.println(mystack1.pop());
		System.out.println();
		System.out.println("stack in mystack2.");	
		for (int i=0;i<8;i++)
			System.out.println(mystack2.pop());

	}

}
