/*assignment 3.3
 * program to show use of static
  */ 
  // STATIC USE IN A PROGRAM
 
package session3c;

//DEFINING A CLASS
public class demostatic {
	// STATIC DECLARATION
	static {
		// IT WILL EXECUTE BEFORE MAIN
		System.out.println("hello i will execute first");
	}

	// METHODD DECLARATION
	void show() {
		// ACCESSED ONLY VIA A OBJECT CREATION
		System.out.println("i am a metohod ");
	}

	public static void main(String[] args) {
		demostatic obj = new demostatic();
		obj.show();

	}

}
