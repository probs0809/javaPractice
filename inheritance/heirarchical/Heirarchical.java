package inheritance.heirarchical;
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
class one 
{ 
	public void hello() 
	{ 
		System.out.print("Hello"); 
	} 
} 

class two extends one 
{ 
	public void world() 
	{ 
		System.out.println(" World"); 
	} 
} 

class three extends one 
{ 
	
} 
 
public class Heirarchical
{ 
	public static void main(String[] args) 
	{ 
		three g = new three(); 
		g.hello(); 
		two t = new two(); 
		t.world(); 
		g.hello(); 
	} 
} 
