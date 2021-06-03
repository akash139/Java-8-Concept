package interfaces;

@FunctionalInterface			// functional interfaces will have only one abstract method.
								// when one method then only we can use lambda expression
interface abc{
	void cal();
}

public class FunctionaInterface {
	public static void main(String[] args) {
		abc a = () -> System.out.println("ABC() method "); // using lambda expression
		a.cal();
	}
}
