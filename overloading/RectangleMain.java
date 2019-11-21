
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

class Rectangle{
    private int length;
    private int breadth;
    public void setData(int length, int breadth){
        this.length = length;
        this.breadth = breadth;

    }

    public void setData(){
        this.length = 100;
        this.breadth = 50;
    }

    public int getArea(){
        return length*breadth;
    }

    public int getPeri(){
        return 2*(length+breadth);
    }
}

public class RectangleMain{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the measurements : ");
        int length = s.nextInt();
        int breadth = s.nextInt();
        r.setData(length, breadth);
        System.out.println("The Area of Rectangle is :"+r.getArea());
        System.out.println("The Perimeter of Rectangle is :"+r.getPeri());

        r.setData();
        System.out.println("The Area of default Rectangle is :"+r.getArea());
        System.out.println("The Perimeter of default Rectangle is :"+r.getPeri());
        s.close();
        
    }
}