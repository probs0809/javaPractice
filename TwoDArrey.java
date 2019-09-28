/*
        - NO FUCKS GIVEN 
        - DON'T THANK ME, JUST BUY ME BUDWEISER 
        - THIS CODE IS TAKING INPUT FROM RANDOM JUST DO THE REQUIRED CHANGES
        - I DON'T KNOW WHY THIS CODE WORKS, BUT IT WORKS
          /\
         /  \        AUTHOR: 'MAYEKAR PRABODH BHALCHANDRA'
        /    \       Email : prabodhmayekar@gmail.com
       /      \      INSTA : blind_coder_0809
      /        \     Facebook : 'Prabodh Mayekar'
     /__________\    GITHUB: probs0809
*/

import java.util.Random;
import java.util.Scanner;

public class TwoDArrey{
    private static int order;

    public static void main(String args[]){
        Random rand = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter the order of matrix: ");
        //order = s.nextInt();
        order = rand.nextInt(9);
        int mat_1[][] = new int[order][order];
        int mat_2[][] = new int[order][order];
        int temp[][] = new int[order][order];
        System.out.println("Please input matrix one value :");
        for(int i = 0; i<order; i++){  
            for(int j = 0 ; j < order; j++){
                mat_1[i][j] = rand.nextInt(9);
                System.out.println("Row :" + (i+1) + ", Column :" + (j+1) + ":"+ mat_1[i][j]);
                //mat_1[i][j] = s.nextInt();
            }
        }

        System.out.println("Please input matrix two value :");
        for(int i = 0; i<order; i++){
            for(int j = 0 ; j < order; j++){
                mat_2[i][j] = rand.nextInt(9);
                System.out.println("Row :" + (i+1) + ", Column :" + (j+1) + ":" + mat_2[i][j]);
                //mat_2[i][j] = s.nextInt();
            }
        }

        System.out.println("Please input case: ");
        //int x  = s.nextInt();
        int x  = rand.nextInt(2);

        s.close();
        switch(x){
            case 0:
                for(int i = 0 ; i < order; i++ ){
                    for(int j = 0 ; j < order; j++ ){
                        temp[i][j] = 0;
                        for(int k = 0 ; k < order; k++){
                            temp[i][j] += mat_1[i][k]*mat_2[k][j];
                        }
                        System.out.print(temp[i][j] + "    ");
                    }
                    System.out.println();
                }
                break;

            case 1:
                for(int i = 0 ; i < order; i++ ){
                    for(int j = 0 ; j < order; j++ ){
                        temp[i][j] = 0;
                        if ( i == j)
                            temp[i][j] += mat_1[i][j] + mat_2[i][j];

                        System.out.print(temp[i][j] + "    ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                for(int i = 0 ; i < order; i++ ){
                    for(int j = 0 ; j < order; j++ ){
                        temp[i][j] = 0;
                        if (i == (order/2) && j == (order/2) && order%2 != 0)
                            temp[i][j] += mat_1[i][j] + mat_2[i][j];
                        else if((i + j) == (order-1) || i == j )
                            temp[i][j] += mat_2[i][j]; 

                        System.out.print(temp[i][j] + "    ");
                    }
                    System.out.println();
                }
                break;
            default:
                break;
        }
            
    }
}
