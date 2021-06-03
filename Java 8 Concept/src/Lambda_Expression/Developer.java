package Lambda_Expression;

@FunctionalInterface
interface GameDeveloper {
	void show();
}

public class Developer {
	public static void main(String[] args) {
		GameDeveloper gd1 = () -> System.out.println("I am a game developer"); // lambda expression
		gd1.show();
	}
}
