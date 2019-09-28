import java.util.Scanner;

class StarTwo{
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Please insert the value:");
		int x = s.nextInt();
		for(int i = 0; i < x; i++){
			for(int j = i; j<x; j++){
				System.out.print("  ");
			}
			for(int j = 0; j<i; j++){
				System.out.print(" *");
			}
			for(int j = 1; j<i; j++){   
				System.out.print(" *");
			}
			s.close();
			System.out.println("");
		}	
	}
}