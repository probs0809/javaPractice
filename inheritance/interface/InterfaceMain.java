
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
class ClassA 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
interface InterfaceB 
{
    public void show();
}

class ClassD extends ClassA implements InterfaceB
{
    public void show()
    {
        System.out.println("show() method implementation");
    }
    public void dispD()
    {
        System.out.println("disp() method of ClassD");
    }
    
}

public class InterfaceMain{
    public static void main(String args[])
    {
        ClassD d = new ClassD();
        d.dispD();
        d.show();
    }
}