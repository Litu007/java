package java15042023;

public class StaticMethod {
	public static void food()
	{
		System.out.println("idealy");
	}

	public static void clothes() {
		System.out.println("jeans");
	}
	
	// When Static Method in the same class we can directly call by the Method name.
	
	public static void main(String[] args) {
		clothes();
		food();

	}

}
