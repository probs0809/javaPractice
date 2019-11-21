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

public class PatternExam{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the input Element: ");
        int n = s.nextInt();

        for(int i = 0; i <= n*2 ; i++){
            if(i%2 != 0){
                for(int j = 0 ; j < i; j++ ){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }

}
