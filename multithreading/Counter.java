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
class Count extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(200);
                System.out.println(" "+i);
            } catch (InterruptedException e) {
                //TODO: handle exception
            }
        }
    }
}

public class Counter{
    public static void main(String[] args) {
        Count c = new Count();
        c.start();
    }
}