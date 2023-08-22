package J1042023;

public class Polymerphisim {
	
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class pig extends Polymerphisim{
	public void animalSound() {
		
		System.out.println("The pig says:wee wee");
	}	
}

class Dog extends Polymerphisim {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }

}
