package interfaces;

interface DevOpsDeveloper{		// This Marker Interface.
}								// There are 3 Marker Interface. Cloneable, Serializable, Remote interface.

@FunctionalInterface			// Interface which have only 1 Abstract method.
interface MobDeveloper {		// If there is a static method in interface it's not a functional interface.
	public void Exp();
}

interface GameDeveloper {
	int Exp = 1;			// In interface local variable are built in final which can't be changed further.
	public void Sal();
	public static void Exp(int Exp) { //Static method in interface can directly be called;
		System.out.println("I have "+Exp+" Expirence as a Game Developer");
		}}

public class Developer {
	public void allDev() {
		System.out.println("All DEVELOPER");
	}
	public static void main(String[] args) {
		Developer sd = new Developer();
		sd.allDev();
		
		MobDeveloper m1 = () -> System.out.println("I don't have experience") ; // used Lambda Expression
		m1.Exp();
		
		GameDeveloper g1 = new GameDeveloper() {	// Anonymous class
			public void Sal() {			// Using anonymous class we can create object of Interface.
				System.out.println("Game Dev: $45000");
			}
		};
		g1.Sal();
		GameDeveloper.Exp(5);
	}
}
