package chapter9;
interface Drawable1{
	void draw();
}
class rectangl implements Drawable1{
	public void draw() {
		System.out.println("Drawing rectangle");
	}
}
class circle implements Drawable1{
	public void draw() {
		System.out.println("Drawing circle");
	}
}
public class Drawable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable1 shap=new circle();
		shap.draw();
		
		System.out.println("*****************");
		
		Drawable1 shap2=new rectangl();
		shap2.draw();
	}

}
