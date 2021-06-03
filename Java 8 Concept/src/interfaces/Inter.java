package interfaces;
			
interface X {
	void A();					//methods in interface by default are abstract
	default void defalt() {
		System.out.println("default Z");
	}
}
interface ab{  		// Marker interface are interface which are have no methods and In-build interface in java is serializable. 
					// ab is example of Marker Interface
}
class Y{
	void Yy() {
		System.out.println("Y class");
	}
}										// class Z extends Y and implements X, ab 
class Z extends Y implements X, ab {	// interface can extends a class as well as implements an interface. 
	public void A() {					//multiple interface are implemented in xyz class
		System.out.println("class Y which implements X");	
		super.Yy();
	}
}
public class Inter {
		public static void main(String[] args) {
			X a1 = new Z();
			a1.A();
		}
}	