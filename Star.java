import java.util.Scanner;

class Star{
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Please insert the value:");
		int x = s.nextInt();
		for(int i = 0; i < x; i++){
			for(int j = 0; j<i; j++){
				if( i >= 3 && j == 0)
					System.out.print("");
				else
					System.out.print("  ");

			}
			for(int j = 0; j<x; j++){
				System.out.print(" *");
			}
			s.close();
			System.out.println("");
		}	
	}
}
