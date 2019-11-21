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
class ClassOne{
    void hello(){
        System.out.print("Hello");
    }
}

class ClassTwo extends ClassOne{
    void world(){
        System.out.println(" World");
    }
}

public class SingleLevel{
    public static void main(String[] args) {
        ClassTwo c = new ClassTwo();
        c.hello();
        c.world();
    }
}