package java15042023;

public class Callingstaticmethodinsameclasss {
	
	static int a=56;
	
	public static void m1() {
	a=420;
		System.out.println(a);
	}
	
	
	public static void m2() {
		int a=67;
		System.out.println(a);
	}

	public static void main(String[] args) {
		m1();
		m2();
		System.out.println(a);

	
	}

}
