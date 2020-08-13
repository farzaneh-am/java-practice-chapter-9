package chapter9;
class balance{
	String name;
	double bal;
	balance(String a,double b){
		name=a;
		bal=b;
	}
	void showbal() {
		if(bal<0)
		{
			System.out.println("--->");
			System.out.println(name+ " : $ "+bal);

		}
	}
}
public class AccuntBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		balance current[]=new balance[4];
		current[0]= new balance("K.J.Filding",123.23);
		current[1]= new balance("Will Tell",-157.02);
		current[2]= new balance("K.J.Filding",123.23);
		current[3]= new balance("Farzaneh",-12.33);
		for(int i=0;i<4;i++)
			current[i].showbal();

	}

}
