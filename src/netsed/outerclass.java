package netsed;

public class outerclass {
int x=10;

class innerclass{
	int y=5;
}
}
class main{
	public static void main(String[] args) {
	outerclass oc=new outerclass();
	outerclass.innerclass in=oc.new innerclass();
	System.out.println(in.y+oc.x);
	
}
}//To access the inner class, create an object of the outer class, and then create an object of the inner class:






