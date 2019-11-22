package basic;

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

public class AddOneD{
	public static void main(String args[]){
		int num[] = new int[5];
		int x = 0;
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<=4; i++){
			System.out.print("Please input Value "+i+":");
			num[i] = s.nextInt();
			x += num[i];
			
		}
		
		System.out.println("The sum of "+num[0]+", "+num[1]+", "+num[2]+", "+num[3]+", "+num[4]+" is "+x);
	}
}
