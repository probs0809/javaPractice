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
import java.util.FormatterClosedException;

public class Main{
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println(" " + a + "/" + b + " is " + c);
        } 
        catch (NumberFormatException e) {
            System.out.println("Please pass the valid arguments : NumberFormatException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please pass the arguments : ArrayIndexOutOfBoundsException ");
            
        } catch (ArithmeticException e) {
            System.out.println("Argument 2 must not be 0 : ArithmeticException ");
            
        } catch (Exception e){
            System.out.println("Exception occur");
            //e.printStackTrace();
        } 
        finally{
            System.out.println("Execution of try catch block is over.");
            
        }
    }
}