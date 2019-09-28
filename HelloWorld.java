public class HelloWorld{
    public static void main(String []args){
	int x = 10;
        for(int i = 0; i<=x; i++){
		for(int j = i; j<= x; j++){
			System.out.print(" *");
		}
		for(int j = 2; j<= i; j++){
			System.out.print("  ");
		}
		for(int j = 1; j<= i; j++){
			System.out.print("  ");
		}
		for(int j = i; j<= x; j++){
			if(i==0 && j==0)
				System.out.print("");
			else
				System.out.print(" *");
		}
		System.out.println("");
	}

	 for(int i = 0; i<=x; i++){
		for(int j = 0; j<= i; j++){
			System.out.print(" *");
		}
		for(int j = i+1; j<= x; j++){
			System.out.print("  ");
		}
		for(int j = i+2; j<= x; j++){
			System.out.print("  ");
		}
		for(int j = 0; j<= i; j++){
			if(i==x && j==0)
				System.out.print("");
			else
				System.out.print(" *");
		}
		System.out.println("");
	}
    }
}