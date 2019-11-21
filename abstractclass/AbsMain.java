//Abstract class must always be inherited
/*
        - NO FUCKS GIVEN 
        - DON'T THANK ME, JUST BUY ME BUDWEISER 
        - I DON'T KNOW WHY THIS CODE WORKS, BUT IT WORKS
          /\
         /  \        AUTHOR: 'MAYEKAR PRABODH BHALCHANDRA'
        /    \       Email : prabodhmayekar@gmail.com
       /      \      INSTA : blind_coder_0809
      /        \     Facebook : 'Prabodh Mayekar'
     /__________\    GITHUB: probs0809
*/
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
