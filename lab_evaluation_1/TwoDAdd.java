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

public class TwoDAdd{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please input the order of matrix: ");
        int n = s.nextInt();
        
        int matrix1[][] = new int[n][n];
        int matrix2[][] = new int[n][n];
        int x=0,y=0;

        System.out.println("Please input Matrix 1: ");
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < n ; j++){
                System.out.print("Please input value for row =  "+ (i+1) + " " + ", Column = "+ (j+1) + " :");
                matrix1[i][j] = s.nextInt();
            }
        }

        System.out.println("Please input Matrix 2: ");
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < n ; j++){
                System.out.print("Please input value for row =  "+ (i+1) + " " + ", Column = "+ (j+1) + " :");
                matrix2[i][j] = s.nextInt();
            }
        }

        System.out.print("Required Output is: ");
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < n ; j++){
                if(j == 0 ){
                    x += matrix1[i][j];
                    y += matrix2[i][j];
                }
            }
        }

        System.out.print(x + y);
        System.out.println();

    }
}
