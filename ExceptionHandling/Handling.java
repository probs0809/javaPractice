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
package ExceptionHandling;

public class Handling{
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println("a/b is "+c);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(NumberFormatException e){
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("Try catch block completed");
        }

    }
}