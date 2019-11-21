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
import java.util.Scanner;

class Factorial{
	public static void main(String args[]){
		System.out.print("Please input the number:");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int fact = 1;
		int factodd = 1;
		if(x != 0){ 
			for(int i = 1; i<= x; i++){
				fact *= i;

				if(i%2 == 1)
					factodd *= i; 
			}
		}
		s.close();
		System.out.println("Factorial is : " + fact);
		System.out.println("Odd Factorial is : " + factodd);
	}
}