package DecisionMakeing;

public class Swaping {

	public static void main(String[] args) {
int a=3;
int b=2;
System.out.println("before swapping");
System.out.println(a);
System.out.println(b);
a+=b;
b=a-b;
a=a-b;
System.out.println("after swapping");

System.out.println(a);
System.out.println(b);
	}

}
