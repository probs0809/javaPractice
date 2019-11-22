package inheritance.multi;

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
		System.out.print(" World"); 
	} 
} 

class three extends two 
{ 
	public void java() 
	{ 
		System.out.println(" Java"); 
	} 
} 

// Drived class 
public class MultiLevel
{ 
	public static void main(String[] args) 
	{ 
		three g = new three(); 
		g.hello(); 
		g.world(); 
		g.java(); 
	} 
} 
