

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
