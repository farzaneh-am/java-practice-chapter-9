package chapter9;
class Dynstack implements Intstack{
	private int stack[];
	private int tos;
	Dynstack(int size){
		stack=new int[size];
		tos=-1;
	}
	public void push(int item) {
		if(tos==stack.length-1) {
			int temp[]=new int[stack.length*2];
			for(int i=0;i<stack.length;i++)
				temp[i]=stack[i];
			stack=temp;
			stack[++tos]=item;
		}
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
public class IFTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dynstack mystack1 = new Dynstack(5);
		Dynstack mystack2 = new Dynstack(8);
		for (int i=0;i<12;i++)
			mystack1.push(i);	
		for(int i=0;i<20;i++)
			mystack2.push(i);
		System.out.println("stack in mystack1.");	
		for (int i=0;i<12;i++)
			System.out.println(mystack1.pop());
		System.out.println();
		System.out.println("stack in mystack2.");	
		for (int i=0;i<20;i++)
			System.out.println(mystack2.pop());

	}

}
