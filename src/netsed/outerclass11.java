package netsed;



public class outerclass11{
	int x=10;
	
	
	private class innerclass1{
		int y=5;
		
	}
	
}

class main11{
	public static void main(String[] args) {
		outerclass11 oc11=new outerclass11();
		outerclass11.innerclass1 in1=oc11.new innerclass1();
		System.out.println(in1.y+oc11.x);
	
}

}
//Unlike a "regular" class, an inner class can be private or protected. If you don't want outside 
//objects to access the inner class, declare the class as private:
