 

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
