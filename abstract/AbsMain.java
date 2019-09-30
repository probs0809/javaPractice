//Abstract class must always be inherited

abstract class Base { 
	abstract void display(); 
} 
class Derived extends Base { 
	void display() { System.out.println("Derived display"); } 
} 
class AbsMain { 
	public static void main(String args[]) {  
		Base b = new Derived(); 
		b.display(); 
	} 
} 
