package Lambda_Expression;

@FunctionalInterface
interface GameDeveloper {
	void show();
}

class XYZ implements GameDeveloper {
	public void show() {
		System.out.println("here in XYZ class");
	}
}

public class Developer {
	public static void main(String[] args) {
		GameDeveloper gd1 = () -> System.out.println("I am a game developer"); // lambda expression
		gd1.show();
		GameDeveloper gd2 = new XYZ();
		gd2.show();
	}

}
