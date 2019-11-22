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
import java.util.*;

public class Arreylist{
    public static void main(String[] args) {
       int n = 5;
       ArrayList<Integer> arrli = new ArrayList<Integer>(n);
       for (int i=1; i<=n; i++) 
           arrli.add(i); 
       System.out.println(arrli);
       arrli.remove(3); 
       System.out.println(arrli); 
       for (int i=0; i<arrli.size(); i++) 
           System.out.print(arrli.get(i)+" "); 
    }
}