package interfaces;

interface A{
	int z = 7;		// local variable created in interface are in-build final which can't be changed further.
	void call();
	default void def(){
		System.out.println("Default in A "+z);
	}
}
interface B{
	void call();
	default void def(){
		System.out.println("Default in B");
		}
}
interface D{
	static void D() {	//we can call static method in interface directly without implementing it.
		System.out.println("I'm interface D");
		}
	interface E{
		static void E() {
			System.out.println("This is inner interface of E");
		}}}
class C implements A, B, D{
	public void call() {
		System.out.println("Call() method");
	}	
	public void def() {
		A.super.def();
		B.super.def();
	}
}
public class MultipleInterface {
	public static void main(String[] args) {
	A a = new C();
	a.call();
	a.def();
	
	D.D();
	
	C c = new C();
	}
}