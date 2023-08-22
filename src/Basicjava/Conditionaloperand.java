package Basicjava;

public class Conditionaloperand {
	public static void main(String[] args) {
		int a=400;
		int b=360;
		int c=40;
		
		
		System.out.println((a>b)&& (a<c));  // this value return false  because(a<c) a is not less than c
		//note 1.....(&& logical AND) logical if all expresion returns true then this operator returns value true.
		
		
		System.out.println((a>b)||(a<c)); // this value returns true because one of the condition is true
		
		//  note2...(||logical OR) logical if any one  expresion returns true then this operator returns value true.
		
	}

}
